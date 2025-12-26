package com.example.demo.controller;

import com.example.demo.model.UserAccount;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserAccountService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserAccountService userService;

    public AuthController(
            AuthenticationManager authenticationManager,
            JwtTokenProvider jwtTokenProvider,
            UserAccountService userService
    ) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    // REGISTER
    @PostMapping("/register")
    public UserAccount register(@RequestBody UserAccount user) {
        return userService.register(user);
    }

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody UserAccount user) {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                user.getUsername(),
                                user.getPassword()
                        )
                );

        return jwtTokenProvider.generateToken(authentication);
    }
}
