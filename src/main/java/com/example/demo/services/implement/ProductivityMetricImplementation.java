package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRepository;

@Service
public class ProductivityMetricImplementation implements ProductivityMetricService {

    @Autowired
    ProductivityMetricRepository obj;

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) {

        
        ProductivityMetricRecord existing =
                obj.findByEmployeeIdAndDate(metric.getEmployeeId(), metric.getDate());

        if (existing != null) {
            return null; 
        }

        
        Double score = calculateScore(
                metric.getHoursLogged(),
                metric.getTasksCompleted(),
                metric.getMeetingsAttended()
        );

        metric.setProductivityScore(score);

        return obj.save(metric);
    }

    @Override
    public ProductivityMetricRecord updateMetric(Long id, ProductivityMetricRecord updated) {

        ProductivityMetricRecord metric = obj.findById(id).orElse(null);

        if (metric != null) {
            metric.setHoursLogged(updated.getHoursLogged());
            metric.setTasksCompleted(updated.getTasksCompleted());
            metric.setMeetingsAttended(updated.getMeetingsAttended());

            Double score = calculateScore(
                    updated.getHoursLogged(),
                    updated.getTasksCompleted(),
                    updated.getMeetingsAttended()
            );

            metric.setProductivityScore(score);

            return obj.save(metric);
        }

        return null;
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployeeId(S employeeId) {
        return obj.findByEmployeeId(employeeId);
    }

    @Override
    public ProductivityMetricRecord getMetricById(Long id) {
        return obj.findById(id).orElse(null);
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return obj.findAll();
    }

    
    private Double calculateScore(Double hours, Integer tasks, Integer meetings) {
        if (hours == null || tasks == null || meetings == null) {
            return 0.0;
        }
        return (hours * 2) + (tasks * 3) - (meetings * 1);
    }
}
