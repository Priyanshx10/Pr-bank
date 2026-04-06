package com.prbank.backend.controller;

import com.prbank.backend.model.User;
import com.prbank.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userRepository.save(user);
        return "User Saved in DB";
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}