package com.backend.rootly.controller;

import com.backend.rootly.dto.auth.LoginRequestDTO;
import com.backend.rootly.dto.auth.LoginResponseDTO;
import com.backend.rootly.dto.auth.RegisterRequestDTO;
import com.backend.rootly.dto.auth.RegisterResponseDTO;
import com.backend.rootly.entity.UserReg;
import com.backend.rootly.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@Valid @RequestBody RegisterRequestDTO request) {

        RegisterResponseDTO response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO request) {

        LoginResponseDTO response = authService.authenticate(request);
        return ResponseEntity.ok(response);
    }
}
