package com.example.demo.service;

import com.example.demo.model.TeamSummaryRecord;
import java.time.LocalDate;
import java.util.List;

public interface TeamSummaryService {

    TeamSummaryRecord generateSummary(String teamName, LocalDate date);

    TeamSummaryRecord getSummaryById(Long id);

    List<TeamSummaryRecord> getSummariesByTeam(String teamName);

    List<TeamSummaryRecord> getAllSummaries();
}
