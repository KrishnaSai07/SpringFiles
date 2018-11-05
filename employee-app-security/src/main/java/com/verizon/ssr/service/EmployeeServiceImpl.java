package com.verizon.ssr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.verizon.ssr.model.Employee;
import com.verizon.ssr.repository.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    private EmployeeDao employeeDao;


	@Override
	public Employee addEmp(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.addEmp(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmp(emp);
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
        return employeeDao.getEmpById(empId);
	}

	@Override
	public boolean deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmp(empId);
	}

	@Override
	public List<Employee> allEmpList() {
		// TODO Auto-generated method stub
		return employeeDao.allEmpList();
	}

}
