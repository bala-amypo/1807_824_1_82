package com.example.demo.service.impl;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.service.EmployeeProfileService;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class EmployeeProfileImplementation implements EmployeeProfileService {

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return employee;
    }

    @Override
    public EmployeeProfile getEmployeeById(Long id) {
        return new EmployeeProfile();
    }

    @Override
    public Optional<EmployeeProfile> findByEmployeeId(String employeeId) {
        return Optional.empty();
    }

    @Override
    public EmployeeProfile updateEmployeeStatus(Long id, Boolean active) {
        EmployeeProfile e = new EmployeeProfile();
        e.setActive(active);
        return e;
    }

    @Override
    public List<EmployeeProfile> getAllEmployees() {
        return new ArrayList<>();
    }
}
