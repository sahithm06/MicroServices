package com.example.employee_service.controller;

import com.example.employee_service.model.Employee;
import com.example.employee_service.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {

        LOGGER.info("Employee add{}" , employee);

        return employeeRepository.addEmployee(employee);

    }

    @GetMapping("/all")
    public List<Employee> findAll(){

        LOGGER.info("Employee find");
        return employeeRepository.findAll();
    }


    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){

        LOGGER.info("Employee find by id{}", id);
        return employeeRepository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){

        LOGGER.info("Employee find : Department id={}", departmentId);
        return employeeRepository.findByDepartment(departmentId);
    }


}
