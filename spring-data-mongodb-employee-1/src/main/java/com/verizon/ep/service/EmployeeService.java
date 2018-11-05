package com.verizon.ep.service;

import java.util.List;


import com.verizon.ep.model.Employee;

public interface EmployeeService {

	Employee getEmployeeById(int empId);
	List<Employee> getAllEmployees();
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	
	boolean existsByDept(String dept);
	
	Employee findAllByDept(String dept);

}
