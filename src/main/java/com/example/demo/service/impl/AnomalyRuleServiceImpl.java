package com.example.demo.service;

import com.example.demo.model.AnomalyRule;
import com.example.demo.repository.AnomalyRuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnomalyRuleServiceImpl implements AnomalyRuleService {

    private final AnomalyRuleRepository ruleRepository;

    public AnomalyRuleServiceImpl(AnomalyRuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    @Override
    public AnomalyRule createRule(AnomalyRule rule) {
        return ruleRepository.save(rule);
    }

    @Override
    public Optional<AnomalyRule> getRuleById(Long id) {
        return ruleRepository.findById(id);
    }

    @Override
    public List<AnomalyRule> getActiveRules() {
        return ruleRepository.findByActiveTrue();
    }

    @Override
    public List<AnomalyRule> getAllRules() {
        return ruleRepository.findAll();
    }
}
