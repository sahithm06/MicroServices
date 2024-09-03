package com.example.service_order.controller;

import com.example.service_order.client.EmployeeClient;
import com.example.service_order.model.Department;
import com.example.service_order.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {

//        log.info("addDepartment" + department);
//        log.info("addDepartment" + department.getId());
//        log.info("addDepartment" + department.getName());
        LOGGER.info("Deaprtment add={}" , department);

        return departmentRepository.addDepartment(department);

    }

    @GetMapping("/all")
    public List<Department> findAll(){

        LOGGER.info("Deaprtment find");
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){

        LOGGER.info("Deaprtment find by id {}", id);
        return departmentRepository.findById(id);
    }

    @GetMapping("/with-employees")
    public List<Department> findAllWithEmployees(){

        LOGGER.info("Deaprtment find");

        List<Department> departments = departmentRepository.findAll();


        departments.forEach(department -> department.setEmployees(employeeClient.findBydepartment(department.getId())));

        return departments;

    }

}
