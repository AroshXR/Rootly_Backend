package com.backend.rootly.service;

import org.springframework.http.ResponseEntity;

import java.util.Locale;

@FunctionalInterface
public interface UserService {

    ResponseEntity<Object> getUserById(String userId, Locale locale);
}
