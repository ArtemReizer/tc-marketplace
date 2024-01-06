package com.teamchallenge.marketplace.dto.userdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public record UserLoginRequestDto(
        @Email
        @NotBlank
        String email,
        @NotBlank
        String password
) {
}
