package com.example.demo.repository;
import com.example.demo.model.AnomalyRules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnomalyRulesRepository extends JpaRepository<AnomalyRules,Long>
{

}