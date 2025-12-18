package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class AnomalyFlagRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private Long metricId;

    private String ruleCode;
    private String severity;

    @Column(columnDefinition = "TEXT")
    private String details;

    private LocalDateTime flaggedAt;

    private Boolean resolved;

    @PrePersist
    public void prePersist() {
        this.flaggedAt = LocalDateTime.now();
        this.resolved = false; // default
    }

    public AnomalyFlagRecord() {}

    public AnomalyFlagRecord(
            Long id,
            Long employeeId,
            Long metricId,
            String ruleCode,
            String severity,
            String details,
            Boolean resolved
    ) {
        this.id = id;
        this.employeeId = employeeId;
        this.metricId = metricId;
        this.ruleCode = ruleCode;
        this.severity = severity;
        this.details = details;
        this.resolved = resolved;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public Long getMetricId() { return metricId; }
    public void setMetricId(Long metricId) { this.metricId = metricId; }

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public LocalDateTime getFlaggedAt() { return flaggedAt; }
    public void setFlaggedAt(LocalDateTime flaggedAt) { this.flaggedAt = flaggedAt; }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }
}
