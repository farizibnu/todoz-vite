package com.todoz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todoz.model.User;
import com.todoz.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
