package com.example.demo.service;

import com.example.demo.model.AnomalyFlagRecord;

import java.util.List;
import java.util.Optional;

public interface AnomalyFlagService {

    AnomalyFlagRecord flagMetric(AnomalyFlagRecord flag);

    Optional<AnomalyFlagRecord> getFlagById(Long id);

    List<AnomalyFlagRecord> getFlagsByMetric(Long metricId);

    List<AnomalyFlagRecord> getAllFlags();

    AnomalyFlagRecord resolveFlag(Long id);
}
