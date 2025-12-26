// package com.example.demo.model;
// import javax.persistence.*;

// @Entity
// public class AnomalyRule {
//     @Id @GeneratedValue private Long id;
//     private String ruleCode;
//     private Double thresholdValue;
//     private Boolean active;

//     public String getRuleCode() { return ruleCode; }
//     public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }
//     public Double getThresholdValue() { return thresholdValue; }
//     public void setThresholdValue(Double thresholdValue) { this.thresholdValue = thresholdValue; }
//     public Boolean getActive() { return active; }
//     public void setActive(Boolean active) { this.active = active; }
// }

package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anomaly_rule")
public class AnomalyRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private Double thresholdValue;
    private Boolean active = true;

    public AnomalyRule() {}

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }

    public Double getThresholdValue() { return thresholdValue; }
    public void setThresholdValue(Double thresholdValue) { this.thresholdValue = thresholdValue; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
