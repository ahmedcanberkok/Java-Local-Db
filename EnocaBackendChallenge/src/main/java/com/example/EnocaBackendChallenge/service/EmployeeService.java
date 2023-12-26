package com.example.EnocaBackendChallenge.service;

import com.example.EnocaBackendChallenge.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findALl();
    Employee find(int id );
    Employee save(Employee employee);
    void delete(Employee employee);
}
