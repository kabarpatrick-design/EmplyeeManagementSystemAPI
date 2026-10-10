package com.chriskar.employee.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DepartmentRequest(
        @NotBlank
        @Size(min = 2, max = 100)
        String name
) {
}
