package com.example.demo.service;

import java.util.List;
import com.example.demo.model.EmployeeProfile;

public interface EmployeeProfileService {

    EmployeeProfile createEmployee(EmployeeProfile employee);

    EmployeeProfile getEmployeeById(Long id);

    List<EmployeeProfile> getAllEmployees();

    EmployeeProfile findByEmployeeId(String employeeId);

    EmployeeProfile updateEmployeeStatus(Long id, boolean active);
}
