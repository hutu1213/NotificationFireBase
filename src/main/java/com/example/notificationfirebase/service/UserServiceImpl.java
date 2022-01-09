package com.example.notificationfirebase.service;

import com.example.notificationfirebase.repository.UserRepository;
import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
