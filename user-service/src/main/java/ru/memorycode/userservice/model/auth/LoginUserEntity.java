package ru.memorycode.userservice.model.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUserEntity {
    private String email;

    private String password;

    private String device;

}
