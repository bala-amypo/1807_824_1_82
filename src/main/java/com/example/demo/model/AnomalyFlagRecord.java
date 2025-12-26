// package com.example.demo.model;
// import javax.persistence.*;

// @Entity
// public class AnomalyFlagRecord {
//     @Id @GeneratedValue private Long id;
//     private String ruleCode;
//     private String severity;
//     private Boolean resolved;
//     private Long metricId;
//     private String details;

//     // Getters and Setters
//     public String getRuleCode() { return ruleCode; }
//     public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }
//     public String getSeverity() { return severity; }
//     public void setSeverity(String severity) { this.severity = severity; }
//     public Boolean getResolved() { return resolved; }
//     public void setResolved(Boolean resolved) { this.resolved = resolved; }
//     public Long getMetricId() { return metricId; }
//     public void setMetricId(Long metricId) { this.metricId = metricId; }
//     public String getDetails() { return details; }
//     public void setDetails(String details) { this.details = details; }
// }

package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anomaly_flag")
public class AnomalyFlagRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long metricId;
    private String ruleCode;
    private String severity;
    private Boolean resolved = false;

    @Column(columnDefinition = "TEXT")
    private String details;

    public AnomalyFlagRecord() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getMetricId() { return metricId; }
    public void setMetricId(Long metricId) { this.metricId = metricId; }

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
