package com.chriskar.employee.repositories;

import com.chriskar.employee.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
