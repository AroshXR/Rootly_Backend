package com.backend.rootly.controller;

import com.backend.rootly.dto.CreateCapsuleRequest;
import com.backend.rootly.entity.Capsule;
import com.backend.rootly.service.CapsuleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/capsules")
public class CapsuleController {

    private final CapsuleService capsuleService;

    public CapsuleController(CapsuleService capsuleService) {
        this.capsuleService = capsuleService;
    }

    @PostMapping
    public ResponseEntity<Capsule> createCapsule(@Valid @RequestBody CreateCapsuleRequest request) {
        Capsule capsule = capsuleService.createCapsule(request);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(capsule.getId())
                .toUri();
        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, location.toString())
                .body(capsule);
    }
}
