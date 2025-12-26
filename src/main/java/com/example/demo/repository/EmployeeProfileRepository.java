package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import com.example.demo.model.*;

public interface EmployeeProfileRepository {
    Optional<EmployeeProfile> findByEmployeeId(String employeeId);
}
