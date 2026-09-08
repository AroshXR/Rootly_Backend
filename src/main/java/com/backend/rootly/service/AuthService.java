package com.backend.rootly.service;

import com.backend.rootly.dto.auth.LoginRequestDTO;
import com.backend.rootly.dto.auth.LoginResponseDTO;
import com.backend.rootly.dto.auth.RegisterRequestDTO;
import com.backend.rootly.dto.auth.RegisterResponseDTO;
import com.backend.rootly.entity.UserReg;
import com.backend.rootly.exception.EmailAlreadyExistsException;
import com.backend.rootly.exception.InvalidCredentialsException;
import com.backend.rootly.exception.UserNotFoundException;
import com.backend.rootly.repository.UserRepository;
import com.backend.rootly.service.security.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public RegisterResponseDTO register(RegisterRequestDTO request) {

        UserReg user = new UserReg();

        if(userRepository.findByEmail(request.email()).isPresent()){
            throw new EmailAlreadyExistsException("Email already exists");
        }

        user.setName(request.name());
        user.setPassword(passwordEncoder.encode(request.password()));
        user.setEmail(request.email());
        user.setDistrict(request.district());
        user.setLanguages(request.languages());
        user.setPhone(request.phone());
        user.setGender(request.gender());
        user.setPhotoUrl(request.photoUrl());

        //This data will fix in here not getting from user
        user.setRole("USER");
        user.setVerificationStatus("PENDING");
        user.setFollowerCount(0);
        user.setFollowingCount(0);
        user.setIsOtpVerified(false);
        user.setProfileVisibility("PUBLIC");
        user.setShowActivity(true);

        UserReg savedUser = userRepository.save(user);

        if (log.isInfoEnabled()) {
            log.info("User saved with id {}", savedUser.getId());
        }
        return new RegisterResponseDTO(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getRole(),
                savedUser.getVerificationStatus()
        );
    }

    public LoginResponseDTO authenticate(LoginRequestDTO request) {

        UserReg user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new UserNotFoundException("Invalid email or password"));

        if (!passwordEncoder.matches(
                request.password(), user.getPassword())) {
            throw new InvalidCredentialsException("Invalid email or password");
        }

        String token = jwtService.generateToken(user.getEmail());

        if (log.isInfoEnabled()) {
            log.info("Authentication success");
        }
        return new LoginResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getVerificationStatus(),
                token
        );
    }
}
