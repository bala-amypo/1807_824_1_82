package com.example.demo.repository;

import com.example.demo.model.EmployeeProfile;
import java.util.*;

public interface EmployeeProfileRepository {
    Optional<EmployeeProfile> findById(Long id);
    Optional<EmployeeProfile> findByEmployeeId(String employeeId);
    EmployeeProfile save(EmployeeProfile e);
    List<EmployeeProfile> findAll();
}
