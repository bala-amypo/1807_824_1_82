package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductivityMetricRecord;

public interface ProductivityMetricRepository
        extends JpaRepository<ProductivityMetricRecord, Long> {

    ProductivityMetricRecord findByEmployeeIdAndDate(Long employeeId, LocalDate date);

    List<ProductivityMetricRecord> findByEmployeeId(Long employeeId);
    
}
