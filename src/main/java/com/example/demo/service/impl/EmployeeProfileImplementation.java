package com.example.demo.service.impl;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.service.EmployeeProfileService;

import java.util.Optional;

public class EmployeeProfileImplementation implements EmployeeProfileService {

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return employee;
    }

    @Override
    public Optional<EmployeeProfile> getEmployeeById(Long id) {
        return Optional.of(new EmployeeProfile());
    }

    @Override
    public Optional<EmployeeProfile> findByEmployeeId(String employeeId) {
        return Optional.empty();
    }

    @Override
    public EmployeeProfile updateEmployeeStatus(Long id, boolean active) {
        EmployeeProfile e = new EmployeeProfile();
        e.setActive(active);
        return e;
    }
}
