package com.verizon.ssr.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.verizon.ssr.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
    Map<Integer,Employee> emps;
    
    

    public EmployeeDaoImpl() {
        
        emps = new TreeMap<Integer,Employee>();
        emps.put(101, new Employee(101,"Harry",23000,12,"Sales"));
        emps.put(102, new Employee(102,"Hermoine",29000,13,"IT"));
        emps.put(103, new Employee(103,"Ron",13000,15,"Security"));
        
        
        
    }

    public Employee addEmp(Employee emp) {
        // TODO Auto-generated method stub
        return emps.put(emp.getEmpId(), emp);
    }

    public Employee updateEmp(Employee emp) {
        // TODO Auto-generated method stub
        return emps.replace(emp.getEmpId(), emp);
    }

    public Employee getEmpById(int empId) {
        // TODO Auto-generated method stub
        return emps.get(empId);
    }

    public boolean deleteEmp(int empId) {
        // TODO Auto-generated method stub
        boolean isDeleted=false;
        if(emps.containsKey(empId))
        {
            emps.remove(empId);
            isDeleted=true;
        }
        return isDeleted;
    }

    public List<Employee>allEmpList() {
        // TODO Auto-generated method stub
        return new ArrayList<Employee>(emps.values());
    }

}
