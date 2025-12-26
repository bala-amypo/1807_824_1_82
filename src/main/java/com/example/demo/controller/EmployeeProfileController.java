package com.example.demo.controller;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.service.EmployeeProfileService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeProfileController {

    private final EmployeeProfileService service;

    public EmployeeProfileController(EmployeeProfileService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<EmployeeProfile> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Optional<EmployeeProfile> getByEmployeeId(@PathVariable String empId) {
        return service.findByEmployeeId(empId);
    }
}
