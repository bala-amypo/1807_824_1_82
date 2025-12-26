package com.example.demo.service.impl;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;

import java.util.List;
import java.util.Optional;

public class ProductivityMetricImplementation implements ProductivityMetricService {

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord r) {
        return r;
    }

    @Override
    public Optional<ProductivityMetricRecord> getMetricById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return List.of();
    }

    // 🔥 ADD THIS
    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId) {
        return List.of();
    }
}
