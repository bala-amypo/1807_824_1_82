package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
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
public class TeamSummaryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;
    private LocalDate summaryDate;
    private Double avgHoursLogged;
    private Double avgTasksCompleted;
    private Double avgScore;
    private Integer anomalyCount;

    public Long getId() {
        return id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSummaryDate(LocalDate summaryDate) {
        this.summaryDate = summaryDate;
    }

    public void setAvgHoursLogged(Double avgHoursLogged) {
        this.avgHoursLogged = avgHoursLogged;
    }

    public void setAvgTasksCompleted(Double avgTasksCompleted) {
        this.avgTasksCompleted = avgTasksCompleted;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public void setAnomalyCount(Integer anomalyCount) {
        this.anomalyCount = anomalyCount;
    }
}
