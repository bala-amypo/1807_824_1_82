package com.example.demo.service;

import com.example.demo.model.ProductivityMetricRecord;
import java.util.List;

public interface ProductivityMetricService {

    ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric);

    ProductivityMetricRecord updateMetric(Long id, ProductivityMetricRecord metric);

    ProductivityMetricRecord getMetricById(Long id);

    List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId);

    List<ProductivityMetricRecord> getAllMetrics();
}
