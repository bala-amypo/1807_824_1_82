package com.example.demo.service.impl;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRecordRepository;
import com.example.demo.service.ProductivityMetricService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProductivityMetricImplementation implements ProductivityMetricService {

    private final ProductivityMetricRecordRepository metricRepo;

    public ProductivityMetricImplementation(ProductivityMetricRecordRepository metricRepo) {
        this.metricRepo = metricRepo;
    }

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) {
        return metricRepo.save(metric);
    }

    @Override
    public Optional<ProductivityMetricRecord> getMetricById(Long id) {
        return metricRepo.findById(id);
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return metricRepo.findAll();
    }
}
