// package com.example.demo.model;
// import java.util.Set;

// public class UserAccount {
//     private Set<String> roles;
//     public Set<String> getRoles() { return roles; }
//     public void setRoles(Set<String> roles) { this.roles = roles; }
// }
package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles")
    private Set<String> roles;

    public UserAccount() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
}


// package com.example.demo.model;

// public class UserAccount {

//     private Long id;
//     private String email;
//     private String password;
//     private String role;

//     public UserAccount() {}

//     public UserAccount(String email, String password, String role) {
//         this.email = email;
//         this.password = password;
//         this.role = role;
//     }

//     public Long getId() {
//         return id;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public String getRole() {
//         return role;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public void setRole(String role) {
//         this.role = role;
//     }
// }