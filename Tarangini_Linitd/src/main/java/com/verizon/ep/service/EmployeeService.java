package com.verizon.ep.service;

import java.util.List;


import com.verizon.ep.model.Employee;

public interface EmployeeService {

	Employee getEmployeeById(long empId);
	List<Employee> getAllEmployees();
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	boolean deleteEmployee(long empId);
	
	boolean existsByDept(String dept);
	
	Employee findAllByDept(String dept);

}
