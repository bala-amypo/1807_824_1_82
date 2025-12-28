package com.example.demo.service.impl;

import com.example.demo.model.UserAccount;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserAccountService;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final JwtTokenProvider jwtTokenProvider =
            new JwtTokenProvider("MySuperSecretVendorSlaKey1234567890", 3600000L);

    @Override
    public UserAccount register(UserAccount user) {
        user.setId(1L); // dummy
        user.setRoles("USER");
        return user;
    }

    @Override
    public String login(UserAccount user) {
        return jwtTokenProvider.createToken(
                user.getEmail(),
                "USER",
                1L
        );
    }
}