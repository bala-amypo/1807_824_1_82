package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
    
