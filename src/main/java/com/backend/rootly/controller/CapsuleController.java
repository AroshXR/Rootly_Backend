package com.backend.rootly.controller;

import com.backend.rootly.domain.CreateCapsuleDomain;
import com.backend.rootly.domain.InviteContributorDomain;
import com.backend.rootly.dto.request.CreateCapsuleRequestDTO;
import com.backend.rootly.dto.request.InviteContributorRequestDTO;
import com.backend.rootly.service.CapsuleService;
import com.backend.rootly.utility.EndPoint;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(EndPoint.API)
@CrossOrigin
@RequiredArgsConstructor
@Log4j2
public class CapsuleController {

    private final CapsuleService capsuleService;
    private final ModelMapper modelMapper;

    @PostMapping(value = {EndPoint.CAPSULES, "/capsules"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createCapsule(
            @Validated @RequestBody CreateCapsuleRequestDTO requestDTO,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        if (log.isDebugEnabled()) {
            log.debug("Received Create Capsule request");
        }
        CreateCapsuleDomain domain = modelMapper.map(requestDTO, CreateCapsuleDomain.class);
        return capsuleService.createCapsule(domain, locale);
    }

    @PostMapping(value = {
            EndPoint.CAPSULE_CONTRIBUTORS,
            EndPoint.CAPSULE_INVITE,
            "/capsules/{capsuleId}/contributors",
            "/capsules/{capsuleId}/invite"
    }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> inviteContributor(
            @PathVariable String capsuleId,
            @Validated @RequestBody InviteContributorRequestDTO requestDTO,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        if (log.isDebugEnabled()) {
            log.debug("Received Invite Contributor request for capsule {}", capsuleId);
        }
        InviteContributorDomain domain = modelMapper.map(requestDTO, InviteContributorDomain.class);
        return capsuleService.inviteContributor(capsuleId, domain, locale);
    }
}
