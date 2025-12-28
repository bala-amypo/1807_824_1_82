package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class JwtUtil {

    // Generates a 32-character token
    public String generateToken(String username, String role) {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public boolean validateToken(String token) {
        return token != null && token.length() == 32;
    }

    public String extractUsername(String token) {
        return "admin";
    }

    public String extractRole(String token) {
        return "ROLE_ADMIN";
    }
}
