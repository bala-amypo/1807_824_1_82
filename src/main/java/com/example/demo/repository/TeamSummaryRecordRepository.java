package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.TeamSummaryRecord;

public interface TeamSummaryRecordRepository extends JpaRepository<TeamSummaryRecord, Long> {

    TeamSummaryRecord findByTeamNameAndSummaryDate(
            String teamName,
            LocalDate summaryDate
    );

    List<TeamSummaryRecord> findByTeamName(String teamName);
    
}
