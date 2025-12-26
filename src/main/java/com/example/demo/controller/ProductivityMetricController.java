package com.example.demo.controller;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metrics")
public class ProductivityMetricController {

    @Autowired
    private ProductivityMetricService metricService;

    @PostMapping
    public ResponseEntity<ProductivityMetricRecord> recordMetric(@RequestBody ProductivityMetricRecord metric) {
        ProductivityMetricRecord saved = metricService.recordMetric(metric);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<ProductivityMetricRecord>> getAllMetrics() {
        return ResponseEntity.ok(metricService.getAllMetrics());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductivityMetricRecord> getMetricById(@PathVariable Long id) {
        return metricService.getMetricById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}