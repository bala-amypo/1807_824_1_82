package com.example.demo.model;
import java.time.LocalDataTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenrationType;
@Entity
public class EmployeeProfile{
    @Id 
    @GeneratedValue(strategy = GenrationType.IDENTITY)
    private Long id;

    @Coulumn(nulllable = false, unique = true)
    private String employeeId;

    @Coulumn(nulllable = false)
    private String fullName;

    @Coulumn(nulllable = false , unique = true)
    private String email;

    private String teamName;

    private String role;
    @Coulumn(nulllable = false)
    private Boolean active = true;

    @Coulumn(nulllable = false , updatable = false)
    private LocalDataTime createdAt;

    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDataTime.now();
    }
    public EmployeeProfile(){ }

    public Long getID(){
        return id;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(String TeamName){
        this.teamName = teamName;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String Role){
        this.role = role;
    }
    public boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active = active;
    }
    public LocalDataTime getCreatedAt(){
        return createdAt;
    }    
}