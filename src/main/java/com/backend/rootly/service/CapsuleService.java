package com.backend.rootly.service;

import com.backend.rootly.domain.CreateCapsuleDomain;
import com.backend.rootly.domain.InviteContributorDomain;
import org.springframework.http.ResponseEntity;

import java.util.Locale;

public interface CapsuleService {

    ResponseEntity<Object> createCapsule(CreateCapsuleDomain request, Locale locale);

    ResponseEntity<Object> inviteContributor(String capsuleId, InviteContributorDomain request, Locale locale);
}
