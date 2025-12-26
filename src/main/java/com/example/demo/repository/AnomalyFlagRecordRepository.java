package com.example.demo.repository;

import com.example.demo.model.AnomalyFlagRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnomalyFlagRecordRepository
        extends JpaRepository<AnomalyFlagRecord, Long> {

    // 🔥 ADD THIS
    List<AnomalyFlagRecord> findByMetricId(Long metricId);
}
