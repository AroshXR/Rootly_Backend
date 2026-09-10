package com.backend.rootly.service.impl;

import com.backend.rootly.dto.response.UserResponseDTO;
import com.backend.rootly.entity.UserReg;
import com.backend.rootly.repository.UserRepository;
import com.backend.rootly.service.UserService;
import com.backend.rootly.utility.MessageConstant;
import com.backend.rootly.utility.ResponseCode;
import com.backend.rootly.utility.ResponseGenerator;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ResponseGenerator responseGenerator;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<Object> getUserById(String userId, Locale locale) {
        UserReg user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return responseGenerator.generateErrorResponse(null, HttpStatus.NOT_FOUND,
                    ResponseCode.USER_NOT_FOUND, MessageConstant.USER_NOT_FOUND, locale);
        }
        UserResponseDTO responseDTO = modelMapper.map(user, UserResponseDTO.class);
        return responseGenerator.generateSuccessResponse(HttpStatus.OK,
                ResponseCode.RSP_SUCCESS, MessageConstant.SUCCESSFULLY_GET, responseDTO);
    }
}
