package com.example.demo.controller;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeProfileService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeProfile> createEmployee(@RequestBody EmployeeProfile employee) {
        EmployeeProfile created = employeeService.createEmployee(employee);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeProfile> getEmployee(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(employeeService.getEmployeeById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<EmployeeProfile> updateStatus(@PathVariable Long id, @RequestParam boolean active) {
        try {
            return ResponseEntity.ok(employeeService.updateEmployeeStatus(id, active));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}