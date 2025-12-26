package com.example.demo.service;

import com.example.demo.model.AnomalyFlagRecord;
import com.example.demo.repository.AnomalyFlagRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnomalyFlagServiceImpl implements AnomalyFlagService {

    private final AnomalyFlagRecordRepository flagRepository;

    public AnomalyFlagServiceImpl(AnomalyFlagRecordRepository flagRepository) {
        this.flagRepository = flagRepository;
    }

    @Override
    public AnomalyFlagRecord flagMetric(AnomalyFlagRecord flag) {
        return flagRepository.save(flag);
    }

    @Override
    public Optional<AnomalyFlagRecord> getFlagById(Long id) {
        return flagRepository.findById(id);
    }

    @Override
    public List<AnomalyFlagRecord> getFlagsByMetric(Long metricId) {
        return flagRepository.findByMetricId(metricId);
    }

    @Override
    public List<AnomalyFlagRecord> getAllFlags() {
        return flagRepository.findAll();
    }

    @Override
    public AnomalyFlagRecord resolveFlag(Long id) {
        AnomalyFlagRecord flag = flagRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flag not found"));
        flag.setResolved(true);
        return flagRepository.save(flag);
    }
}
