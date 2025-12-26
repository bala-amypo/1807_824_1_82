package com.example.demo.model;

import java.time.LocalDate;

public class ProductivityMetricRecord {

    private Long id;
    private Long employeeId;
    private LocalDate date;

    private double hoursLogged;        // primitive
    private int tasksCompleted;        // primitive
    private int meetingsAttended;      // primitive
    private double productivityScore;  // primitive

    private String rawDataJson;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getHoursLogged() { return hoursLogged; }
    public void setHoursLogged(double hoursLogged) { this.hoursLogged = hoursLogged; }

    public int getTasksCompleted() { return tasksCompleted; }
    public void setTasksCompleted(int tasksCompleted) { this.tasksCompleted = tasksCompleted; }

    public int getMeetingsAttended() { return meetingsAttended; }
    public void setMeetingsAttended(int meetingsAttended) { this.meetingsAttended = meetingsAttended; }

    public double getProductivityScore() { return productivityScore; }
    public void setProductivityScore(double productivityScore) { this.productivityScore = productivityScore; }

    public String getRawDataJson() { return rawDataJson; }
    public void setRawDataJson(String rawDataJson) { this.rawDataJson = rawDataJson; }
}
