// package com.example.demo.service;

// import com.example.demo.model.EmployeeProfile;
// import org.springframework.stereotype.Service;
// import java.util.Optional;

// @Service
// public class EmployeeProfileService {
//     public EmployeeProfile createEmployee(EmployeeProfile e) { return null; }
//     public EmployeeProfile getEmployeeById(Long id) { return null; }
//     public Optional<EmployeeProfile> findByEmployeeId(String empId) { return Optional.empty(); }
//     public EmployeeProfile updateEmployeeStatus(Long id, boolean status) { return null; }
// }

package com.example.demo.service;

import com.example.demo.model.EmployeeProfile;

import java.util.List;
import java.util.Optional;

public interface EmployeeProfileService {

    EmployeeProfile createEmployee(EmployeeProfile employee);

    EmployeeProfile getEmployeeById(Long id);

    Optional<EmployeeProfile> findByEmployeeId(String employeeId);

    EmployeeProfile updateEmployeeStatus(Long id, Boolean active);

    List<EmployeeProfile> getAllEmployees();
}
