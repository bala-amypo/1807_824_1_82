package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AnomalyRule;

public interface AnomalyRuleRepository extends JpaRepository<AnomalyRule, Long> {

    AnomalyRule findByRuleCode(String ruleCode);

    List<AnomalyRule> findByActive(Boolean active);
}
