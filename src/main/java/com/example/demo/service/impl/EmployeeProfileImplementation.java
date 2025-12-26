package com.example.demo.service.impl;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;
import com.example.demo.service.EmployeeProfileService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class EmployeeProfileImplementation implements EmployeeProfileService {

    private final EmployeeProfileRepository employeeRepo;

    public EmployeeProfileImplementation(EmployeeProfileRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public EmployeeProfile updateEmployeeStatus(Long id, boolean active) {
        EmployeeProfile e = getEmployeeById(id);
        e.setActive(active);
        return employeeRepo.save(e);
    }

    @Override
    public EmployeeProfile getEmployeeById(Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public Optional<EmployeeProfile> findByEmployeeId(String employeeId) {
        return employeeRepo.findByEmployeeId(employeeId);
    }

    @Override
    public List<EmployeeProfile> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
