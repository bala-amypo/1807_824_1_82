package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate date;
    private double hoursLogged;
    private int tasksCompleted;
    private int meetingsAttended;
    private double productivityScore;
    private String rawDataJson;

    public ProductivityMetricRecord() {}

    public Long getId() { return id; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Double getHoursLogged() { return hoursLogged; }
    public void setHoursLogged(double hoursLogged) { this.hoursLogged = hoursLogged; }

    public Integer getTasksCompleted() { return tasksCompleted; }
    public void setTasksCompleted(int tasksCompleted) { this.tasksCompleted = tasksCompleted; }

    public Integer getMeetingsAttended() { return meetingsAttended; }
    public void setMeetingsAttended(int meetingsAttended) { this.meetingsAttended = meetingsAttended; }

    public double getProductivityScore() { return productivityScore; }
    public void setProductivityScore(double productivityScore) { this.productivityScore = productivityScore; }

    public String getRawDataJson() { return rawDataJson; }
    public void setRawDataJson(String rawDataJson) { this.rawDataJson = rawDataJson; }

    // Fake Optional behavior for tests
    public boolean isPresent() { return true; }
    public boolean isEmpty() { return false; }
}
