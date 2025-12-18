package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductivityMetricRecord;

public interface ProductivityMetricRepository
        extends JpaRepository<ProductivityMetricRecord, Long> {

    // Check duplicate metric for same employee & date
    ProductivityMetricRecord findByEmployeeIdAndDate(
            String employeeId,
            LocalDate date
    );

    // Get all metrics of an employee
    List<ProductivityMetricRecord> findByEmployeeId(String employeeId);
}
