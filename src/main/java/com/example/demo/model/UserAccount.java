package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private Set<String> roles = new HashSet<>();

    public UserAccount() {}

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
}
