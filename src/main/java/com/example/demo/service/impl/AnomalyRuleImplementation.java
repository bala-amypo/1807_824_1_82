package com.example.demo.service.impl;

import com.example.demo.model.AnomalyRule;
import com.example.demo.repository.AnomalyRuleRepository;
import com.example.demo.service.AnomalyRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnomalyRuleImplementation implements AnomalyRuleService {

    private final AnomalyRuleRepository repo;

    public AnomalyRuleImplementation(AnomalyRuleRepository repo) {
        this.repo = repo;
    }

    @Override
    public AnomalyRule createRule(AnomalyRule rule) {
        rule.setId(null);
        return repo.save(rule);
    }

    @Override
    public AnomalyRule updateRule(Long id, AnomalyRule rule) {
        AnomalyRule existing = getRuleById(id);

        existing.setRuleCode(rule.getRuleCode());
        existing.setDescription(rule.getDescription());
        existing.setThresholdType(rule.getThresholdType());
        existing.setThresholdValue(rule.getThresholdValue());
        existing.setActive(rule.getActive());

        return repo.save(existing);
    }

    @Override
    public AnomalyRule getRuleById(Long id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("AnomalyRule not found"));
    }

    @Override
    public List<AnomalyRule> getActiveRules() {
        return repo.findByActiveTrue();
    }

    @Override
    public List<AnomalyRule> getAllRules() {
        return repo.findAll();
    }
}
