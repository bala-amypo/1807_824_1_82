package com.example.demo.service;

import com.example.demo.model.ProductivityMetricRecord;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductivityMetricService {
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) { return null; }
    public Optional<ProductivityMetricRecord> getMetricById(Long id) { return Optional.empty(); }
    public List<ProductivityMetricRecord> getAllMetrics() { return List.of(); }
}