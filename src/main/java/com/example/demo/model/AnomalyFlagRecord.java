package com.example.demo.model;
import javax.persistence.*;

@Entity
public class AnomalyFlagRecord {
    @Id @GeneratedValue private Long id;
    private String ruleCode;
    private String severity;
    private Boolean resolved;
    private Long metricId;
    private String details;

    // Getters and Setters
    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }
    public Long getMetricId() { return metricId; }
    public void setMetricId(Long metricId) { this.metricId = metricId; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}