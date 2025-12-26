package com.example.demo.model;

import java.util.Set;

public class UserAccount {

    private String email;
    private String passwordHash;
    private Set<String> roles;

    public UserAccount() {}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
}
