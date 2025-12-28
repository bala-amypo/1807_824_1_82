package com.example.demo.dto;
import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;

public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}
