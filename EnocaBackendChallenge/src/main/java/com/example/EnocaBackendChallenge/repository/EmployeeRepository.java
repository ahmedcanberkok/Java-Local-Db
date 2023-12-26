package com.example.EnocaBackendChallenge.repository;

import com.example.EnocaBackendChallenge.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
