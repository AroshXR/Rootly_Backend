package com.backend.rootly.service;

import com.backend.rootly.dto.CreateCapsuleRequest;
import com.backend.rootly.dto.InviteContributorRequest;
import com.backend.rootly.entity.Capsule;
import com.backend.rootly.entity.UnlockCondition;
import com.backend.rootly.enums.CapsuleStatus;
import com.backend.rootly.enums.CapsulePrivacy;
import com.backend.rootly.enums.UnlockConditionType;
import com.backend.rootly.exception.ResourceNotFoundException;
import com.backend.rootly.repository.CapsuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class CapsuleService {

    private final CapsuleRepository capsuleRepository;
    private final Clock clock;

    @Autowired
    public CapsuleService(CapsuleRepository capsuleRepository) {
        this(capsuleRepository, Clock.systemUTC());
    }

    CapsuleService(CapsuleRepository capsuleRepository, Clock clock) {
        this.capsuleRepository = capsuleRepository;
        this.clock = clock;
    }

    public Capsule createCapsule(CreateCapsuleRequest request) {
        validateUnlockCondition(request.unlockCondition());

        List<String> sharedUserIds = cleanIds(request.sharedWithUserIds());
        if (request.privacy() == CapsulePrivacy.SHARED && sharedUserIds.isEmpty()) {
            throw new IllegalArgumentException("sharedWithUserIds is required when privacy is shared");
        }

        Instant now = Instant.now(clock);
        Capsule capsule = Capsule.builder()
                .creatorId(request.creatorId().trim())
                .title(trimToNull(request.title()))
                .description(trimToNull(request.description()))
                .coverPhotoUrl(trimToNull(request.coverPhotoUrl()))
                .type(request.type())
                .unlockCondition(request.unlockCondition())
                .privacy(request.privacy())
                .sharedWithUserIds(sharedUserIds)
                .contributorIds(cleanIds(request.contributorIds()))
                .status(CapsuleStatus.OPEN)
                .chainedFromCapsuleId(trimToNull(request.chainedFromCapsuleId()))
                .createdAt(now)
                .updatedAt(now)
                .build();
        return capsuleRepository.save(capsule);
    }

    /**
     * Adds an invited contributor to an open capsule. A contributor is stored only once,
     * which prevents an invite retry from creating duplicate entries.
     *
     * @param capsuleId the capsule receiving the invitation
     * @param request the contributor to invite
     * @return the updated capsule
     */
    public Capsule inviteContributor(String capsuleId, InviteContributorRequest request) {
        String normalizedCapsuleId = requireId(capsuleId, "capsuleId is required");
        String contributorId = requireContributorId(request);
        Capsule capsule = capsuleRepository.findById(normalizedCapsuleId)
                .orElseThrow(() -> new ResourceNotFoundException("Capsule not found: " + normalizedCapsuleId));
        validateContributorInvitation(capsule, contributorId);

        List<String> contributorIds = cleanIds(capsule.getContributorIds());
        contributorIds.add(contributorId);
        capsule.setContributorIds(contributorIds);
        capsule.setUpdatedAt(Instant.now(clock));
        return capsuleRepository.save(capsule);
    }

    private static String requireContributorId(InviteContributorRequest request) {
        return requireId(request == null ? null : request.contributorId(), "contributorId is required");
    }

    private static String requireId(String value, String message) {
        String id = trimToNull(value);
        if (id == null) {
            throw new IllegalArgumentException(message);
        }
        return id;
    }

    @SuppressWarnings("PMD.LawOfDemeter") // Capsule state is intentionally validated by the application service.
    private static void validateContributorInvitation(Capsule capsule, String contributorId) {
        if (capsule.getStatus() != CapsuleStatus.OPEN) {
            throw new IllegalStateException("Contributors can only be invited to an open capsule");
        }
        if (contributorId.equals(capsule.getCreatorId())) {
            throw new IllegalArgumentException("The capsule creator is already a contributor");
        }

        if (cleanIds(capsule.getContributorIds()).contains(contributorId)) {
            throw new IllegalStateException("User is already a contributor to this capsule");
        }
    }

    @SuppressWarnings("PMD.LawOfDemeter") // UnlockCondition is a request value object, so its fields must be inspected here.
    private void validateUnlockCondition(UnlockCondition condition) {
        if (condition.getType() == null) {
            throw new IllegalArgumentException("unlockCondition.type is required");
        }
        if (condition.getType() == UnlockConditionType.DATE) {
            if (condition.getDate() == null || !condition.getDate().isAfter(Instant.now(clock))) {
                throw new IllegalArgumentException("unlockCondition.date must be a future date");
            }
        } else if (condition.getType() == UnlockConditionType.LOCATION) {
            requireText(condition.getLocation(), "unlockCondition.location is required for a location unlock");
        } else if (condition.getType() == UnlockConditionType.OCCASION) {
            requireText(condition.getOccasionName(), "unlockCondition.occasionName is required for an occasion unlock");
        }
    }

    private static void requireText(String value, String message) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(message);
        }
    }

    private static List<String> cleanIds(List<String> ids) {
        if (ids == null) {
            return List.of();
        }
        Set<String> uniqueIds = new LinkedHashSet<>();
        for (String id : ids) {
            String cleanedId = trimToNull(id);
            if (cleanedId != null) {
                uniqueIds.add(cleanedId);
            }
        }
        return new ArrayList<>(uniqueIds);
    }

    private static String trimToNull(String value) {
        return value == null || value.isBlank() ? null : value.trim();
    }
}
