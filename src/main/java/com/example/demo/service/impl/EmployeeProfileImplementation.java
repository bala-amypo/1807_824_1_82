package com.example.demo.service;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeProfileService {

    @Autowired
    private EmployeeProfileRepository employeeRepo;

    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        // Basic validation logic could go here
        if (employee.getActive() == null) {
            employee.setActive(true); // Default to active
        }
        return employeeRepo.save(employee);
    }

    public EmployeeProfile getEmployeeById(Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    public Optional<EmployeeProfile> findByEmployeeId(String empId) {
        return employeeRepo.findByEmployeeId(empId);
    }

    public EmployeeProfile updateEmployeeStatus(Long id, boolean isActive) {
        EmployeeProfile employee = getEmployeeById(id);
        employee.setActive(isActive);
        return employeeRepo.save(employee);
    }
}