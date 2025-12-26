package com.example.demo.controller;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductivityMetricController {

    private final ProductivityMetricService service;

    public ProductivityMetricController(ProductivityMetricService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public List<ProductivityMetricRecord> getAll() {
        return service.getAllMetrics();
    }

    @GetMapping("/metrics/{id}")
    public Optional<ProductivityMetricRecord> getById(@PathVariable Long id) {
        return service.getMetricById(id);
    }
}
