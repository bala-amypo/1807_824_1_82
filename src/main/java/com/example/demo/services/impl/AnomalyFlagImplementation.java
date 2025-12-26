package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.AnomalyFlagRecord;
import com.example.demo.repository.AnomalyFlagRecordRepository;

@Service
public class AnomalyFlagImplementation implements AnomalyFlagService {

    private final AnomalyFlagRepository repository;

    public AnomalyFlagImplementation(AnomalyFlagRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnomalyFlagRecord flagAnomaly(AnomalyFlagRecord flag) {
        flag.setResolved(false);
        return repository.save(flag);
    }

    @Override
    public AnomalyFlagRecord resolveFlag(Long id) {

        AnomalyFlagRecord flag = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Anomaly flag not found"));

        flag.setResolved(true);
        return repository.save(flag);
    }

    @Override
    public List<AnomalyFlagRecord> getFlagsByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Override
    public List<AnomalyFlagRecord> getFlagsByMetric(Long metricId) {
        return repository.findByMetricId(metricId);
    }

    @Override
    public List<AnomalyFlagRecord> getAllFlags() {
        return repository.findAll();
    }
}
