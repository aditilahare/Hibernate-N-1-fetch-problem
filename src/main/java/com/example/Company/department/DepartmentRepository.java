package com.example.Company.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

//    @Query("select d from Department d join fetch d.employees")
//    List<Department> findAll();
}
