package com.backend.rootly.controller;

import com.backend.rootly.service.UserService;
import com.backend.rootly.utility.EndPoint;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(EndPoint.API)
@CrossOrigin
@RequiredArgsConstructor
@Log4j2
public class UserController {

    private final UserService userService;

    @GetMapping(value = {EndPoint.USER_PROFILE, "/users/{userId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUserProfile(
            @PathVariable String userId,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        if (log.isDebugEnabled()) {
            log.debug("Received Get User Profile request for id: {}", userId);
        }
        return userService.getUserById(userId, locale);
    }
}
