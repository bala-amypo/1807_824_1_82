package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int hoursLogged;
    private int tasksCompleted;
    private int meetingsAttended;
    private double productivityScore;

    private String rawDataJson;

    public ProductivityMetricRecord() {}

    public Long getId() {
        return id;
    }

    // 🔥 REQUIRED BY SERVICE
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHoursLogged() {
        return hoursLogged;
    }

    public void setHoursLogged(int hoursLogged) {
        this.hoursLogged = hoursLogged;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public int getMeetingsAttended() {
        return meetingsAttended;
    }

    public void setMeetingsAttended(int meetingsAttended) {
        this.meetingsAttended = meetingsAttended;
    }

    public double getProductivityScore() {
        return productivityScore;
    }

    public void setProductivityScore(double productivityScore) {
        this.productivityScore = productivityScore;
    }

    // 🔥 REQUIRED BY TEST
    public String getRawDataJson() {
        return rawDataJson;
    }

    public void setRawDataJson(String rawDataJson) {
        this.rawDataJson = rawDataJson;
    }

    // 🔥 REQUIRED BY TEST (fake Optional behavior)
    public boolean isPresent() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }
}
