package com.verizon.ssr.repository;

import java.util.List;

import com.verizon.ssr.model.Employee;

public interface EmployeeDao {
	
	Employee addEmp(Employee emp);
    Employee updateEmp(Employee emp);
    Employee getEmpById(int empId);
    boolean deleteEmp(int empId);
    List<Employee> allEmpList();
    


}
