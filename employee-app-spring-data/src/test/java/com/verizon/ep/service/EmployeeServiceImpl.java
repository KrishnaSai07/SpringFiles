package com.verizon.ep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.verizon.ep.dao.EmployeeRepository;
import com.verizon.ep.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee getEmployeeById(long empId) {
		// TODO Auto-generated method stub
		Employee employee=null;
		
		Optional<Employee> optEmployee = employeeRepository.findById(empId);
		if(optEmployee.isPresent())
		{
			employee = optEmployee.get();
		}
		
			return employee;
	}
	

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee addContact(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateContact(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public boolean deleteContact(long empId) {
		// TODO Auto-generated method stub
		boolean isDeleted=false;
		if(employeeRepository.existsById(empId))
		{
		employeeRepository.deleteById(empId);
		isDeleted= true;
		}
		return isDeleted;
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean deleteEmployee(long empId) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean existsByDept(String dept) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Employee findAllByDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}	
	

}
