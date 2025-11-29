package com.brian.store.controller;

import java.util.List;
import com.brian.store.repositories.UserRepository;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

import com.brian.store.entities.User;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;

    // UserController(UserRepository userRepository) {
    // this.userRepository = userRepository;
    // }

    public List<User> getAllUsers() {

        userRepository
    }
}
