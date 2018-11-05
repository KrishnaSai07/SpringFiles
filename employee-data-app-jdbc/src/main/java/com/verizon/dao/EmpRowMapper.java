package com.verizon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.verizon.model.Employee;


public class EmpRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        Employee employee = new Employee();
        // fucntion to retrieve one column at a time depending on datatype
        employee.setEmpId(rs.getInt(1));
        employee.setEmpName(rs.getString(2));
        employee.setBasic(rs.getDouble(3));
        employee.setHra(rs.getDouble(4));
        employee.setDept(rs.getString(5));

        // colm name or number
        // in jdbc index starts with 1

        return employee;
        
    }

}
