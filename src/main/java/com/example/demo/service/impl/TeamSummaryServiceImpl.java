package com.example.demo.service;

import com.example.demo.model.TeamSummaryRecord;
import com.example.demo.repository.TeamSummaryRecordRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TeamSummaryServiceImpl implements TeamSummaryService {

    private final TeamSummaryRecordRepository summaryRepository;

    public TeamSummaryServiceImpl(TeamSummaryRecordRepository summaryRepository) {
        this.summaryRepository = summaryRepository;
    }

    @Override
    public TeamSummaryRecord saveSummary(TeamSummaryRecord summary) {
        return summaryRepository.save(summary);
    }

    @Override
    public List<TeamSummaryRecord> getAllSummaries() {
        return summaryRepository.findAll();
    }

    @Override
    public List<TeamSummaryRecord> getSummaryByDate(LocalDate date) {
        return summaryRepository.findBySummaryDate(date);
    }
}
