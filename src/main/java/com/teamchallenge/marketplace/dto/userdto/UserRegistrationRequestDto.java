package com.teamchallenge.marketplace.dto.userdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRegistrationRequestDto(
        @Email
        @NotBlank
        String email,
        @NotBlank
        String name,
        @NotBlank
        String password,
        @NotBlank
        String phoneNumber
) {
}
