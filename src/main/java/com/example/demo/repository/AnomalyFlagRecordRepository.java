package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface extends AnomalyFlagRecordRepository  JpaRepository<AnomalyFlagRecord,Long>
{

}