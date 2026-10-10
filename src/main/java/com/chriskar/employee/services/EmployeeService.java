package com.chriskar.employee.services;

import com.chriskar.employee.dto.EmployeeRequest;
import com.chriskar.employee.dto.EmployeeResponse;
import com.chriskar.employee.models.Employee;
import com.chriskar.employee.repositories.DepartmentRepository;
import com.chriskar.employee.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional(readOnly = true)
   public List<EmployeeResponse>findAll(){
        return employeeRepository.findAll().stream().map(EmployeeResponse::from).toList();
    }
    @Transactional(readOnly = true)
    public EmployeeResponse findById(Long id){
        return EmployeeResponse.from(getEmployee(id));
    }

    private Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
