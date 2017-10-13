package com.akjavadev.auth.service;

import com.akjavadev.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
