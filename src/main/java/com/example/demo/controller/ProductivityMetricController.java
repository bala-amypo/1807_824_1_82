package com.example.demo.controller;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.service.ProductivityMetricService;
import java.util.List;

public class ProductivityMetricController {

    private final ProductivityMetricService service;

    public ProductivityMetricController(ProductivityMetricService service) {
        this.service = service;
    }

    public List<ProductivityMetricRecord> getMetricsByEmployee(Long id) {
        return service.getMetricsByEmployee(id);
    }
}
