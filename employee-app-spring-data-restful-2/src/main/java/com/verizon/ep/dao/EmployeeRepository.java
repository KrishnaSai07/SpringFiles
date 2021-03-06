package com.verizon.ep.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.ep.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	boolean existsByDept(String dept);
	
	Employee findAllByDept(String emailId);
	
}
