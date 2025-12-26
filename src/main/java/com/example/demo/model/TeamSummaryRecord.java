package com.example.demo.model;

public class TeamSummaryRecord {

    private String teamName;
    private double avgTasksCompleted;
    private double avgHoursLogged;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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
}
