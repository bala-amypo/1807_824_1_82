package com.example.demo.service.impl;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductivityMetricImplementation implements ProductivityMetricService {

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord m) {
        return m;
    }

    @Override
    public Optional<ProductivityMetricRecord> getMetricById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return new ArrayList<>();
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployee(Long empId) {
        return new ArrayList<>();
    }
}
