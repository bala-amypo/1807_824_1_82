package com.example.demo.service;

import com.example.demo.model.UserAccount;

public interface UserAccountService {

    User register(User user);

    String login(User user);   // ✅ ADD THIS
}