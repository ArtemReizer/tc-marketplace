package com.teamchallenge.marketplace.service;

import com.teamchallenge.marketplace.dto.userdto.UserLoginResponseDto;
import com.teamchallenge.marketplace.dto.userdto.UserRegistrationRequestDto;
import com.teamchallenge.marketplace.dto.userdto.UserRegistrationResponseDto;
import com.teamchallenge.marketplace.exceptions.RegistrationException;
import com.teamchallenge.marketplace.models.User;
import org.springframework.stereotype.Service;

public interface UserService {
    UserRegistrationResponseDto register (UserRegistrationRequestDto request)
            throws RegistrationException;

    User getAuthenticatedUser();
}
