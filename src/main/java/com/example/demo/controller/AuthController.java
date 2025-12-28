package com.example.demo.controller;

import com.example.demo.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String username,
            @RequestParam String password) {

        // Dummy validation
        if (!username.equals("admin") || !password.equals("admin123")) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(username, "ROLE_ADMIN");

        return Map.of("token", token);
    }
}
