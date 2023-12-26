package com.example.EnocaBackendChallenge.service;

import com.example.EnocaBackendChallenge.entity.Employee;
import com.example.EnocaBackendChallenge.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository ;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findALl() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee find(int id) {
        Optional<Employee>  employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();

        }
        return null ;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
