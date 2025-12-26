package com.example.demo.service;

import com.example.demo.model.TeamSummaryRecord;

import java.time.LocalDate;
import java.util.List;

public interface TeamSummaryService {

    TeamSummaryRecord saveSummary(TeamSummaryRecord summary);

    List<TeamSummaryRecord> getAllSummaries();

    List<TeamSummaryRecord> getSummaryByDate(LocalDate date);
}
