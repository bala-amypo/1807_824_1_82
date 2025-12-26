package com.example.demo.repository;

import com.example.demo.model.ProductivityMetricRecord;
import java.util.*;

public interface ProductivityMetricRecordRepository {
    Optional<ProductivityMetricRecord> findById(Long id);
    List<ProductivityMetricRecord> findByEmployeeId(Long employeeId);
    ProductivityMetricRecord save(ProductivityMetricRecord r);
    List<ProductivityMetricRecord> findAll();
}
