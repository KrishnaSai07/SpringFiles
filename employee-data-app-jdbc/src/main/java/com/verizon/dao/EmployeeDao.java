package com.verizon.dao;

import java.util.List;

import com.verizon.model.Employee;

public interface EmployeeDao {

    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(int empId);
    boolean deleteEmployeeById(int empId);
    List<Employee> getAllEmployees();
    
}



