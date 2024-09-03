package com.example.service_order.client;

import com.example.service_order.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{departmentid}")
    public List<Employee> findBydepartment(@PathVariable Long departmentid);
}