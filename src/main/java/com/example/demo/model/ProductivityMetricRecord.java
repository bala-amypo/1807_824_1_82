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