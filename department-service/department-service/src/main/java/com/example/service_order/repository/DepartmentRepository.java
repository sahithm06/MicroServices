package com.example.service_order.repository;

import com.example.service_order.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DepartmentRepository {

   private List<Department> departments = new ArrayList<>();

    public Department addDepartment( Department department ) {
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
          return departments.stream()
                .filter(department -> department.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Department> findAll() {
        return departments;
    }


}
