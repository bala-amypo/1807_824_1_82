package com.example.demo.model;

import java.time.LocalDate;

public class TeamSummaryRecord {

    private String teamName;
    private LocalDate summaryDate;
    private double avgScore;
    private double avgTasksCompleted;
    private double avgHoursLogged;
    private int anomalyCount;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public LocalDate getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(LocalDate summaryDate) {
        this.summaryDate = summaryDate;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public double getAvgTasksCompleted() {
        return avgTasksCompleted;
    }

    public void setAvgTasksCompleted(double avgTasksCompleted) {
        this.avgTasksCompleted = avgTasksCompleted;
    }

    public double getAvgHoursLogged() {
        return avgHoursLogged;
    }

    public void setAvgHoursLogged(double avgHoursLogged) {
        this.avgHoursLogged = avgHoursLogged;
    }

    public int getAnomalyCount() {
        return anomalyCount;
    }

    public void setAnomalyCount(int anomalyCount) {
        this.anomalyCount = anomalyCount;
    }
}
