package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserAccount;
import com.example.demo.repository.UserAccountRepository;

@Service
public class UserAccountImplement implements UserAccountService {

    @Autowired
    UserAccountRepository obj;

    @Override
    public UserAccount registerUser(UserAccount user) {
    
        return obj.save(user);
    }

    @Override
    public UserAccount findByEmail(String email) {
        return obj.findByEmail(email);
    }

    @Override
    public UserAccount findById(Long id) {
        return obj.findById(id).orElse(null);
    }
}
