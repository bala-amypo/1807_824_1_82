package com.example.demo.service.impl;

import com.example.demo.model.TeamSummaryRecord;
import com.example.demo.repository.TeamSummaryRepository;
import com.example.demo.service.TeamSummaryService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TeamSummaryImplementation implements TeamSummaryService {

    private final TeamSummaryRepository repo;

    public TeamSummaryImplementation(TeamSummaryRepository repo) {
        this.repo = repo;
    }

    @Override
    public TeamSummaryRecord generateSummary(String teamName, LocalDate date) {

        TeamSummaryRecord summary = new TeamSummaryRecord();
        summary.setTeamName(teamName);
        summary.setSummaryDate(date);

        // placeholder values (usually calculated)
        summary.setAvgHoursLogged(0.0);
        summary.setAvgTasksCompleted(0.0);
        summary.setAvgScore(0.0);
        summary.setAnomalyCount(0);

        return repo.save(summary);
    }

    @Override
    public TeamSummaryRecord getSummaryById(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("TeamSummary not found"));
    }

    @Override
    public List<TeamSummaryRecord> getSummariesByTeam(String teamName) {
        return repo.findByTeamName(teamName);
    }

    @Override
    public List<TeamSummaryRecord> getAllSummaries() {
        return repo.findAll();
    }
}
