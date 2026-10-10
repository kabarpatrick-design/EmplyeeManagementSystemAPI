package com.chriskar.employee.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record EmployeeRequest(
        @NotBlank
        @Size(min = 2, max = 100)
        String firstName,
        @NotBlank
        @Size(min = 2, max = 100)
        String lastName,
        @Email
        @NotBlank
        @Size(max = 100)
        String email,
        @NotNull
        @DecimalMin("0.00")
        BigDecimal salary,
        @NotNull
        Long departmentId
) {
}
