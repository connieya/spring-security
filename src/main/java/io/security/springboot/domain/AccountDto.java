package io.security.springboot.domain;

import lombok.Data;

@Data
public class AccountDto {

    private String name;
    private String password;
    private String email;
    private String age;
    private String role;
}
