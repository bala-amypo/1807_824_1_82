package com.example.demo.service;

import com.example.demo.model.EmployeeProfile;
import java.util.List;
import java.util.Optional;

public interface EmployeeProfileService {

    EmployeeProfile createEmployee(EmployeeProfile e);
    EmployeeProfile getEmployeeById(Long id);
    Optional<EmployeeProfile> findByEmployeeId(String empId);
    EmployeeProfile updateEmployeeStatus(Long id, Boolean active);
}
