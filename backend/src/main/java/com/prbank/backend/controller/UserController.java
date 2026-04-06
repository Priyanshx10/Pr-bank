package com.prbank.backend.controller;

import com.prbank.backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        users.add(user);
        return "User Registered Successfully";
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }
}