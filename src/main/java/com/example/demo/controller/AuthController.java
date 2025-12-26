package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserAccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.authentication.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Auth")
public class AuthController {

    private final UserAccountService userService;
    private final AuthenticationManager authManager;
    private final JwtTokenProvider jwt;

    public AuthController(UserAccountService userService,
                          AuthenticationManager authManager,
                          JwtTokenProvider jwt) {
        this.userService = userService;
        this.authManager = authManager;
        this.jwt = jwt;
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest r) {
        userService.registerUser(r);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest r) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(r.getEmail(), r.getPassword())
        );
        return new AuthResponse(jwt.generateToken(r.getEmail()));
    }
}
