package com.example.employee_service.repository;


import com.example.employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(  Employee Employee) {
        employees.add(Employee);
        return Employee;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(Employee -> Employee.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee>  findByDepartment(Long departmentId) {
        return employees.stream().filter(e -> e.departmentId().equals(departmentId)).toList();

    }
}
