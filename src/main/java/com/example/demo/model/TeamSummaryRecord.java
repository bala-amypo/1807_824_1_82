package com.example.demo.model;

import java.time.LocalDate;

public class TeamSummaryRecord {

    private String teamName;
    private Double avgHoursLogged;
    private Double avgScore;
    private Double avgTasksCompleted;   // ✅ ADD THIS
    private Integer anomalyCount;
    private LocalDate summaryDate;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getAvgHoursLogged() {
        return avgHoursLogged;
    }

    public void setAvgHoursLogged(Double avgHoursLogged) {
        this.avgHoursLogged = avgHoursLogged;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    // 🔥 THIS IS WHAT WAS MISSING
    public Double getAvgTasksCompleted() {
        return avgTasksCompleted;
    }

    public void setAvgTasksCompleted(Double avgTasksCompleted) {
        this.avgTasksCompleted = avgTasksCompleted;
    }

    public Integer getAnomalyCount() {
        return anomalyCount;
    }

    public void setAnomalyCount(Integer anomalyCount) {
        this.anomalyCount = anomalyCount;
    }

    public LocalDate getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(LocalDate summaryDate) {
        this.summaryDate = summaryDate;
    }
}
