package com.example.EnocaBackendChallenge.controller;

import com.example.EnocaBackendChallenge.entity.Employee;
import com.example.EnocaBackendChallenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<Employee> find ( ) {
      return    employeeService.findALl();

    }
    @GetMapping("/{id}")
    public Employee findById (@PathVariable int id ) {
        return  employeeService.find(id);

    }

    @PostMapping("/")
    public Employee save (@RequestBody Employee employee ) {
        return  employeeService.save(employee);

    }
    @PutMapping("/{id}")
    public Employee update (@RequestBody Employee employee,@PathVariable int id ) {
        Employee foundEmployee = employeeService.find(id);
        if (foundEmployee != null) {
            employee.setId(id);
            return  employeeService.save(employee);
        }
        return  null ;


    }


    @DeleteMapping("/{id}")
    public Employee delete (@PathVariable int id ) {
      Employee employee = employeeService.find(id);
      employeeService.delete(employee);
        return  employee;

    }





}
