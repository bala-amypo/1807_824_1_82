package com.example.demo.service.impl;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;
import com.example.demo.service.EmployeeProfileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeProfileImplementation
        implements EmployeeProfileService {

    private final EmployeeProfileRepository repo;

    public EmployeeProfileImplementation(EmployeeProfileRepository repo) {
        this.repo = repo;
    }

    @Override
    public EmployeeProfile save(EmployeeProfile profile) {
        return repo.save(profile);
    }

    @Override
    public Optional<EmployeeProfile> getEmployeeById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<EmployeeProfile> getAllEmployees() {
        return repo.findAll();
    }
}
