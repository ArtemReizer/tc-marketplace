package com.teamchallenge.marketplace.service.impl;

import com.teamchallenge.marketplace.dto.userdto.UserRegistrationRequestDto;
import com.teamchallenge.marketplace.dto.userdto.UserRegistrationResponseDto;
import com.teamchallenge.marketplace.exceptions.RegistrationException;
import com.teamchallenge.marketplace.models.User;
import com.teamchallenge.marketplace.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public UserRegistrationResponseDto register(UserRegistrationRequestDto request) throws RegistrationException {
        return null;
    }

    @Override
    public User getAuthenticatedUser() {
        return null;
    }
}
