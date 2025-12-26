package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.AnomalyFlagRecord;
import com.example.demo.service.AnomalyFlagService;

@RestController
@RequestMapping("/api/anomalies")
public class AnomalyFlagController {

    private final AnomalyFlagService service;

    public AnomalyFlagController(AnomalyFlagService service) {
        this.service = service;
    }

    @PostMapping
    public AnomalyFlagRecord flagAnomaly(
            @RequestBody AnomalyFlagRecord flag
    ) {
        return service.flagAnomaly(flag);
    }

    @PutMapping("/{id}/resolve")
    public AnomalyFlagRecord resolveAnomaly(@PathVariable Long id) {
        return service.resolveFlag(id);
    }

    @GetMapping("/employee/{employeeId}")
    public List<AnomalyFlagRecord> getByEmployee(
            @PathVariable Long employeeId
    ) {
        return service.getFlagsByEmployee(employeeId);
    }

    @GetMapping("/metric/{metricId}")
    public List<AnomalyFlagRecord> getByMetric(
            @PathVariable Long metricId
    ) {
        return service.getFlagsByMetric(metricId);
    }

    @GetMapping
    public List<AnomalyFlagRecord> getAllFlags() {
        return service.getAllFlags();
    }
}
