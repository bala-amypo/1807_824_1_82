package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRepository;
import com.example.demo.service.ProductivityMetricService;

@Service
public class ProductivityMetricImplementation implements ProductivityMetricService {

    private final ProductivityMetricRepository repository;

    public ProductivityMetricImplementation(ProductivityMetricRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) {
        return repository.save(metric);
    }

    @Override
    public ProductivityMetricRecord updateMetric(Long id, ProductivityMetricRecord updated) {

        ProductivityMetricRecord existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Metric not found"));

        existing.setHoursLogged(updated.getHoursLogged());
        existing.setTasksCompleted(updated.getTasksCompleted());
        existing.setMeetingsAttended(updated.getMeetingsAttended());
        existing.setProductivityScore(updated.getProductivityScore());

        return repository.save(existing);
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployeeId(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Override
    public ProductivityMetricRecord getMetricById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Metric not found"));
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return repository.findAll();
    }
    @Override
public List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId) {
    return repo.findByEmployeeId(employeeId);
}

}
