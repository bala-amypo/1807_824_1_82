package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeId;
    private String fullName;
    private String email;
    private String teamName;
    private String role;
    private Boolean active;

    private LocalDate date;
    private Double hoursLogged;
    private Integer tasksCompleted;
    private Integer meetingsAttended;
    private Double productivityScore;

    @Column(columnDefinition = "TEXT")
    private String rawDataJson;

    private LocalDateTime createdAt;
    private LocalDateTime submittedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    public ProductivityMetricRecord() {}

    public ProductivityMetricRecord(
            Long id,
            String employeeId,
            String fullName,
            String email,
            String teamName,
            String role,
            Boolean active,
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
        this.fullName = fullName;
        this.email = email;
        this.teamName = teamName;
        this.role = role;
        this.active = active;
        this.date = date;
        this.hoursLogged = hoursLogged;
        this.tasksCompleted = tasksCompleted;
        this.meetingsAttended = meetingsAttended;
        this.productivityScore = productivityScore;
        this.rawDataJson = rawDataJson;
        this.submittedAt = submittedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Double getHoursLogged() { return hoursLogged; }
    public void setHoursLogged(Double hoursLogged) { this.hoursLogged = hoursLogged; }

    public Integer getTasksCompleted() { return tasksCompleted; }
    public void setTasksCompleted(Integer tasksCompleted) { this.tasksCompleted = tasksCompleted; }

    public Integer getMeetingsAttended() { return meetingsAttended; }
    public void setMeetingsAttended(Integer meetingsAttended) { this.meetingsAttended = meetingsAttended; }

    public Double getProductivityScore() { return productivityScore; }
    public void setProductivityScore(Double productivityScore) { this.productivityScore = productivityScore; }

    public String getRawDataJson() { return rawDataJson; }
    public void setRawDataJson(String rawDataJson) { this.rawDataJson = rawDataJson; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(LocalDateTime submittedAt) { this.submittedAt = submittedAt; }
}
