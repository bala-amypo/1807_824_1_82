package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.AnomalyRule;
import com.example.demo.service.AnomalyRuleService;

@RestController
@RequestMapping("/api/anomaly-rules")
public class AnomalyRuleController {

    @Autowired
    AnomalyRuleService service;

   
    @PostMapping
    public AnomalyRule createRule(@RequestBody AnomalyRule rule) {
        return service.createRule(rule);
    }

    @PutMapping("/{id}")
    public AnomalyRule updateRule(
            @PathVariable Long id,
            @RequestBody AnomalyRule updatedRule
    ) {
        return service.updateRule(id, updatedRule);
    }

    
    @GetMapping("/active")
    public List<AnomalyRule> getActiveRules() {
        return service.getActiveRules();
    }

    
    @GetMapping("/{id}")
    public AnomalyRule getRuleById(@PathVariable Long id) {
        
        return service.getAllRules()
                .stream()
                .filter(rule -> rule.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

   
    @GetMapping
    public List<AnomalyRule> getAllRules() {
        return service.getAllRules();
    }
}
