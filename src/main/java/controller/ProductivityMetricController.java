package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;

@RestController
@RequestMapping("/api/metrics")
public class ProductivityMetricController {

    private final ProductivityMetricService service;

    public ProductivityMetricController(ProductivityMetricService service) {
        this.service = service;
    }

    @PostMapping
    public ProductivityMetricRecord recordMetric(
            @RequestBody ProductivityMetricRecord metric
    ) {
        return service.recordMetric(metric);
    }

    @PutMapping("/{id}")
    public ProductivityMetricRecord updateMetric(
            @PathVariable Long id,
            @RequestBody ProductivityMetricRecord updated
    ) {
        return service.updateMetric(id, updated);
    }

    @GetMapping("/employee/{employeeId}")
    public List<ProductivityMetricRecord> getMetricsByEmployee(
            @PathVariable Long employeeId
    ) {
        return service.getMetricsByEmployeeId(employeeId);
    }

    @GetMapping("/{id}")
    public ProductivityMetricRecord getMetricById(@PathVariable Long id) {
        return service.getMetricById(id);
    }

    @GetMapping
    public List<ProductivityMetricRecord> getAllMetrics() {
        return service.getAllMetrics();
    }
}
