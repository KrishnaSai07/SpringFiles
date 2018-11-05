package com.verizon.ep.service;

import java.util.List;


import com.verizon.ep.model.Employee;

public interface EmployeeService {
	
	Employee getEmployeeById(long empId);
	List<Employee> getAllEmployee();
	Employee addContact(Employee employee);
	Employee updateContact(Employee employee);
	boolean deleteContact(long empId);

}
