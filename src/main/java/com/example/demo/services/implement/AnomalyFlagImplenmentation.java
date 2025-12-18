package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnomalyFlagRecord;
import com.example.demo.repository.AnomalyFlagRepository;

@Service
public class AnomalyFlagImplement implements AnomalyFlagService {

    @Autowired
    AnomalyFlagRepository obj;

    @Override
    public AnomalyFlagRecord flagAnomaly(AnomalyFlagRecord flag) {
        return obj.save(flag);
    }

    @Override
    public AnomalyFlagRecord resolveFlag(Long id) {

        AnomalyFlagRecord flag = obj.findById(id).orElse(null);

        if (flag != null) {
            flag.setResolved(true);
            return obj.save(flag);
        }

        return null;
    }

    @Override
    public List<AnomalyFlagRecord> getFlagsByEmployee(Long employeeId) {
        return obj.findByEmployeeId(employeeId);
    }

    @Override
    public List<AnomalyFlagRecord> getFlagsByMetric(Long metricId) {
        return obj.findByMetricId(metricId);
    }

    @Override
    public List<AnomalyFlagRecord> getAllFlags() {
        return obj.findAll();
    }
}
