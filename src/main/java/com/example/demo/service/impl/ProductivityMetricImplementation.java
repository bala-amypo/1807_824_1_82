package com.example.demo.service.impl;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRecordRepository;
import com.example.demo.service.ProductivityMetricService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductivityMetricImplementation
        implements ProductivityMetricService {

    private final ProductivityMetricRepository repo;

    public ProductivityMetricImplementation(ProductivityMetricRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) {
        
        return repo.save(metric);
    }
    

    @Override
    public ProductivityMetricRecord updateMetric(
            Long id,
            ProductivityMetricRecord metric) {

        ProductivityMetricRecord existing = getMetricById(id);

        existing.setDate(metric.getDate());
        existing.setHoursLogged(metric.getHoursLogged());
        existing.setTasksCompleted(metric.getTasksCompleted());
        existing.setMeetingsAttended(metric.getMeetingsAttended());
        existing.setProductivityScore(metric.getProductivityScore());

        return repo.save(existing);
    }

    @Override
    public ProductivityMetricRecord getMetricById(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Metric not found"));
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId) {
        return repo.findByEmployeeId(employeeId);
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return repo.findAll();
    }
}
