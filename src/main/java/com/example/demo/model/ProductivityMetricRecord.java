package com.example.demo.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public ProductivityMetricRecord{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String employeeId;

    private LocalDate date;

    private Double hoursLogged;

    private int tasksCompleted;

    private int meetingAttended;

    private Double productivityScore;

    private String rawDataJson;

    private LocalDateTime submittedAt;

     @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
    }
    

  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Long getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
}

public LocalDate getDate() {
    return date;
}

public void setDate(LocalDate date) {
    this.date = date;
}

public Double getHoursLogged() {
    return hoursLogged;
}

public void setHoursLogged(Double hoursLogged) {
    this.hoursLogged = hoursLogged;
}

public Integer getTasksCompleted() {
    return tasksCompleted;
}

public void setTasksCompleted(Integer tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
}

public Integer getMeetingsAttended() {
    return meetingsAttended;
}

public void setMeetingsAttended(Integer meetingsAttended) {
    this.meetingsAttended = meetingsAttended;
}

public Double getProductivityScore() {
    return productivityScore;
}

public void setProductivityScore(Double productivityScore) {
    this.productivityScore = productivityScore;
}

public String getRawDataJson() {
    return rawDataJson;
}

public void setRawDataJson(String rawDataJson) {
    this.rawDataJson = rawDataJson;
}

public LocalDateTime getSubmittedAt() {
    return submittedAt;
}

public void setSubmittedAt(LocalDateTime submittedAt) {
    this.submittedAt = submittedAt;
}

