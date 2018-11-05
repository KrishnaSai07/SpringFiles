package com.verizon.ep.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.verizon.ep.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    boolean existsByDept(String dept);
	
	Employee findAllByDept(String emailId);
}
