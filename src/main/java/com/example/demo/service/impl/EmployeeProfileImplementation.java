// package com.example.demo.service;

// import com.example.demo.model.EmployeeProfile;
// import com.example.demo.repository.EmployeeProfileRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.Optional;

// @Service
// public class EmployeeProfileService {

//     @Autowired
//     private EmployeeProfileRepository employeeRepo;

//     public EmployeeProfile createEmployee(EmployeeProfile employee) {
//         // Basic validation logic could go here
//         if (employee.getActive() == null) {
//             employee.setActive(true); // Default to active
//         }
//         return employeeRepo.save(employee);
//     }

//     public EmployeeProfile getEmployeeById(Long id) {
//         return employeeRepo.findById(id)
//                 .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
//     }

//     public Optional<EmployeeProfile> findByEmployeeId(String empId) {
//         return employeeRepo.findByEmployeeId(empId);
//     }

//     public EmployeeProfile updateEmployeeStatus(Long id, boolean isActive) {
//         EmployeeProfile employee = getEmployeeById(id);
//         employee.setActive(isActive);
//         return employeeRepo.save(employee);
//     }
// }

package com.example.demo.service;

import com.example.demo.model.EmployeeProfile;
import com.example.demo.repository.EmployeeProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    private final EmployeeProfileRepository employeeRepo;

    public EmployeeProfileServiceImpl(EmployeeProfileRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public EmployeeProfile createEmployee(EmployeeProfile employee) {
        return employeeRepo.save(employee);
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
    public EmployeeProfile updateEmployeeStatus(Long id, Boolean active) {
        EmployeeProfile employee = getEmployeeById(id);
        employee.setActive(active);
        return employeeRepo.save(employee);
    }

    @Override
    public List<EmployeeProfile> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
