package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnomalyRule;
import com.example.demo.repository.AnomalyRuleRepository;

@Service
public class AnomalyRuleImplementation implements AnomalyRuleService {

    @Autowired
    AnomalyRuleRepository obj;

    @Override
    public AnomalyRule createRule(AnomalyRule rule) {
        return obj.save(rule);
    }

    @Override
    public AnomalyRule updateRule(Long id, AnomalyRule updatedRule) {

        AnomalyRule rule = obj.findById(id).orElse(null);

        if (rule != null) {
            rule.setDescription(updatedRule.getDescription());
            rule.setThresholdType(updatedRule.getThresholdType());
            rule.setThresholdValue(updatedRule.getThresholdValue());
            rule.setActive(updatedRule.getActive());

            return obj.save(rule);
        }

        return null;
    }

    @Override
    public List<AnomalyRule> getActiveRules() {
        return obj.findByActive(true);
    }

    @Override
    public AnomalyRule getRuleByCode(String rule) {
        return obj.findByRuleCode(ruleCode);
    }

    @Override
    public List<AnomalyRule> getAllRules() {
        return obj.findAll();
    }
}
