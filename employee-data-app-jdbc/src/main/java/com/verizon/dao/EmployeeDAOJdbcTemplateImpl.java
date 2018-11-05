package com.verizon.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.verizon.model.Employee;
@Repository
public class EmployeeDAOJdbcTemplateImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public EmployeeDAOJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public Employee addEmployee(Employee employee) {
        int count = jdbcTemplate.update(IQueryMapper.INS_EMP_QRY,employee.getEmpId(),employee.getEmpName(),employee.getBasic(),employee.getHra(),employee.getDept());
        if (count < 1) {
            employee = null;
            // to inform insertion didn't happen
        }

        return employee;    }

    @Override
    public Employee updateEmployee(Employee employee) {
        int count = jdbcTemplate.update(IQueryMapper.UPDATE_EMP_QRY,employee.getEmpName(),employee.getBasic(),employee.getHra(),employee.getDept(),employee.getEmpId());
        if (count < 1) {
            employee = null;

        }

        return employee;    }

    @Override
    public Employee getEmployeeById(int empId) {
        
        List<Employee> employees= jdbcTemplate.query(IQueryMapper.GET_EMPLOYEE_QRY, 
                new Object[] {empId},
                new EmpRowMapper());
        //passing obj of row mapper
        Employee employee = null;
        if(employee!=null && employees.size()==1)
        {
            employee = employees.get(0);
        }
    

        return employee;
    }

    @Override
    public boolean deleteEmployeeById(int empId) {
        
        boolean isDeleted = false;
        int count = jdbcTemplate.update(IQueryMapper.DEL_EMP_QRY,empId);
        if(count>=1) {
            isDeleted = true;
        }
        return isDeleted;
    }
    
    @Override
    public List<Employee> getAllEmployees() {
        
        List<Employee> employees= jdbcTemplate.query(IQueryMapper.GET_ALL_EMPLOYEE_QRY, 
                                                  new EmpRowMapper()); 
        //passing obj of row mapper
        return employees;
    
    }

}

