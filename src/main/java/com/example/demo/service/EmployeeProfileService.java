package com.example.demo.service;

import com.example.demo.model.EmployeeProfile;
import java.util.List;
import java.util.Optional;

public interface EmployeeProfileService {

    EmployeeProfile save(EmployeeProfile profile);

    Optional<EmployeeProfile> getEmployeeById(Long id);

    List<EmployeeProfile> getAllEmployees();
}
