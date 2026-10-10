package com.chriskar.employee.dto;


import com.chriskar.employee.models.Employee;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EmployeeResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        BigDecimal salary,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        DepartmentResponse department
) {
    public static EmployeeResponse from(Employee employee){
        return new EmployeeResponse(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getCreatedAt(),
                employee.getUpdatedAt(),
                DepartmentResponse.from(employee.getDepartment())
        );
    }
}
