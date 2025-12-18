package com.example.demo.service;

import java.util.List;
import com.example.demo.model.ProductivityMetricRecord;

public interface ProductivityMetricService {

    ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric);

    ProductivityMetricRecord updateMetric(Long id, ProductivityMetricRecord updated);

    List<ProductivityMetricRecord> getMetricsByEmployeeId(Long employeeId);

    ProductivityMetricRecord getMetricById(Long id);

    List<ProductivityMetricRecord> getAllMetrics();
}
