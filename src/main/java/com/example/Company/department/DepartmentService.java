package com.example.Company.department;

import com.example.Company.employee.Employee;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();

        log.info("Found {} departments ", departments.size());

        List<Employee> employees = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toList());

        return departments;
    }
}
