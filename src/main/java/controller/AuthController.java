package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.UserAccount;
import com.example.demo.service.UserAccountService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserAccountService service;

    public AuthController(UserAccountService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public UserAccount register(@RequestBody UserAccount user) {
        return service.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserAccount user) {

        UserAccount existing = service.findByEmail(user.getEmail());

        if (existing == null) {
            return "User not found";
        }

        if (existing.getPasswordHash().equals(user.getPasswordHash())) {
            return "Login successful";
        }

        return "Invalid credentials";
    }
}
