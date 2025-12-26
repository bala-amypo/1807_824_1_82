package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class AnomalyRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private double thresholdValue;
    private boolean active = true;

    public AnomalyRule() {}

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }

    public double getThresholdValue() { return thresholdValue; }
    public void setThresholdValue(double thresholdValue) { this.thresholdValue = thresholdValue; }

    public boolean isActive() { return active; }
}
