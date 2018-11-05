package com.verizon.service;

import java.util.List;

import com.verizon.model.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(int empId);
    boolean deleteEmployeeById(int empId);
    List<Employee> getAllEmployees();
}


