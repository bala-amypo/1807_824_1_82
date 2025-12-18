package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TeamSummaryRecord;
import com.example.demo.repository.TeamSummaryRepository;

@Service
public class TeamSummaryImplement implements TeamSummaryService {

    @Autowired
    TeamSummaryRepository obj;

    @Override
    public TeamSummaryRecord generateSummary(String teamName, LocalDate summaryDate) {

        
        TeamSummaryRecord existing =
                obj.findByTeamNameAndSummaryDate(teamName, summaryDate);

        if (existing != null) {
            return existing;
        }

       
        TeamSummaryRecord summary = new TeamSummaryRecord();
        summary.setTeamName(teamName);
        summary.setSummaryDate(summaryDate);

        summary.setAvgHoursLogged(0.0);
        summary.setAvgTasksCompleted(0.0);
        summary.setAvgScore(0.0);
        summary.setAnomalyCount(0);

        return obj.save(summary);
    }

    @Override
    public List<TeamSummaryRecord> getSummariesByTeam(String teamName) {
        return obj.findByTeamName(teamName);
    }

    @Override
    public List<TeamSummaryRecord> getAllSummaries() {
        return obj.findAll();
    }
}
