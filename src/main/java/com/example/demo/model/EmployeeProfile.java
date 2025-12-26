// package com.example.demo.model;

// import javax.persistence.*; // Or jakarta.persistence if using Boot 3

// @Entity
// public class EmployeeProfile {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String employeeId;
//     private String fullName;
//     private String email;
//     private String teamName;
//     private Boolean active;

//     // Getters and Setters
//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }
//     public String getEmployeeId() { return employeeId; }
//     public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
//     public String getFullName() { return fullName; }
//     public void setFullName(String fullName) { this.fullName = fullName; }
//     public String getEmail() { return email; }
//     public void setEmail(String email) { this.email = email; }
//     public String getTeamName() { return teamName; }
//     public void setTeamName(String teamName) { this.teamName = teamName; }
//     public Boolean getActive() { return active; }
//     public void setActive(Boolean active) { this.active = active; }
// }
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_profile")
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String employeeId;

    private String fullName;
    private String email;
    private Boolean active = true;
    private String teamName;

    public EmployeeProfile() {}

    public EmployeeProfile(Long id, String employeeId, String fullName, String email) {
        this.id = id;
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }
}
