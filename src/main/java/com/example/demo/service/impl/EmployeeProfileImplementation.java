package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;

@Service
public class EmployeeProfileImplementation implements EmployeeProfileService {

    @Autowired
    EmployeeProfileRepository obj;

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return obj.save(employee);
    }

    @Override
    public EmployeeProfile getEmployeeById(Long id) {
        return obj.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeProfile> getAllEmployees() {
        return obj.findAll();
    }

    @Override
    public EmployeeProfile findByEmployeeId(String employeeId) {
        return obj.findByEmployeeId(employeeId);
    }

    @Override
    public EmployeeProfile updateEmployeeStatus(Long id, boolean active) {
        EmployeeProfile emp = obj.findById(id).orElse(null);

        if (emp != null) {
            emp.setActive(active);
            return obj.save(emp);
        }

        return null;
    }
}
