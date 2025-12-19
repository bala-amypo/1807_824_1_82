package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductivityMetricRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private LocalDate date;
    private Double hoursLogged;
    private Integer tasksCompleted;
    private Integer meetingsAttended;
    private Double productivityScore;

    public Long getEmployeeId() {
        return employeeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getHoursLogged() {
        return hoursLogged;
    }

    public Integer getTasksCompleted() {
        return tasksCompleted;
    }

    public Integer getMeetingsAttended() {
        return meetingsAttended;
    }

    public void setProductivityScore(Double productivityScore) {
        this.productivityScore = productivityScore;
    }
}
