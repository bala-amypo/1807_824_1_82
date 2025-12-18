package com.example.demo.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class ProductivityMetricRecord{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String employeeId;

 
    private String fullName;

    private String email;

    private String teamName;

    private String role;
   private Boolean active;
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
    }
    

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
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
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
    public boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active = active;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    } 
    public void setActiveLocalDateTime(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }  
    
    public ProductivityMetricRecord() {}

    public ProductivityMetricRecord(
            Long id,
            Long employeeId,
            LocalDate date,
            Double hoursLogged,
            Integer tasksCompleted,
            Integer meetingsAttended,
            Double productivityScore,
            String rawDataJson,
            LocalDateTime submittedAt
    ) {
        this.id = id;
        this.employeeId = employeeId;
        this.date = date;
        this.hoursLogged = hoursLogged;
        this.tasksCompleted = tasksCompleted;
        this.meetingsAttended = meetingsAttended;
        this.productivityScore = productivityScore;
        this.rawDataJson = rawDataJson;
        this.submittedAt = submittedAt;
    }
}