package com.example.service;

import com.example.dto.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    public User getRandomUser() {
        User user = new User();
        user.setId((long)(Math.random() * 100));
        user.setUsername(UUID.randomUUID().toString());
        return user;
    }
}
