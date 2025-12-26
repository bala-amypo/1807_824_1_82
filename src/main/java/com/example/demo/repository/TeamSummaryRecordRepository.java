package com.example.demo.repository;

import com.example.demo.model.TeamSummaryRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TeamSummaryRecordRepository
        extends JpaRepository<TeamSummaryRecord, Long> {

    List<TeamSummaryRecord> findBySummaryDate(LocalDate summaryDate);
}
