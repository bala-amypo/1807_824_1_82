package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.model.ProductivityMetricRecord;

public interface ProductivityMetricService {

    ProductivityMetricRecord recordMetric(ProductivityMetricRecord r);

    Optional<ProductivityMetricRecord> getMetricById(Long id);

    // 🔥 REQUIRED BY CONTROLLER
    List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId);

    List<ProductivityMetricRecord> getAllMetrics();
}
