package io.security.springboot.service;

import io.security.springboot.domain.Account;

import java.util.List;

public interface UserService {

    void createUser(Account account);
}
