package com.myorg.booklibrary.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ResetPasswordDTO {
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 2, message = "Username is too short")
    @NonNull
    private String username;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 2, message = "Password is too short")
    @NonNull
    private String password;

    @NotBlank(message = "New password cannot be blank")
    @Size(min = 2, message = "New password is too short")
    @NonNull
    private String newPassword;

}
