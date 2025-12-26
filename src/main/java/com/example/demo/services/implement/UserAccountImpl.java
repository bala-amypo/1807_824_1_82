package com.example.demo.service.impl;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserAccountImpl implements UserAccountService {

    private final UserAccountRepository repo;
    private final PasswordEncoder encoder;

    public UserAccountServiceImpl(UserAccountRepository repo,
                                  PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @Override
    public void registerUser(RegisterRequest request) {

        if (repo.existsByEmail(request.getEmail())) {
            throw new RuntimeException("User already exists");
        }

        UserAccount user = new UserAccount();
        user.setEmail(request.getEmail());
        user.setPasswordHash(encoder.encode(request.getPassword()));
        user.setRoles(Set.of("USER"));

        repo.save(user);
    }
}
