package com.verizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.dao.EmployeeDao;
import com.verizon.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao empDao;
    
    
    @Override
    public Employee addEmployee(Employee employee) {
        return empDao.addEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return empDao.updateEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return empDao.getEmployeeById(empId);
    }

    @Override
    public boolean deleteEmployeeById(int empId) {
        return empDao.deleteEmployeeById(empId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empDao.getAllEmployees();
    }

}
