package com.verizon.ep.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.ep.model.Employee;
import com.verizon.ep.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		return new ResponseEntity<>(
				service.getAllEmployees(),HttpStatus.OK
				);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getContactById(@PathVariable("id") int empId)
	{
		ResponseEntity<Employee> resp;
		Employee c = service.getEmployeeById(empId);
		if(c == null)
			resp=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp=new ResponseEntity<>(c,HttpStatus.OK);
		return resp;
		
	}
	
	/*@GetMapping("/{field}/{srhValue}")
	public ResponseEntity<List<Employee>> getAllContacts(
			@PathVariable("field") String fieldBy,
			@PathVariable("srhValue") String searchValue)
	{
		List<Employee> results = null;
		
		switch(fieldBy)
		{
		case "dept":
			Employee cByMobNum = service.findByMobileNumber(searchValue);
			if(cByMobNum!=null)
			{
				results= Collections.singletonList(cByMobNum);
			}
			break;
		case "emailId":
			Contact cByEmail = service.findByEmailId(searchValue);
			if(cByEmail!=null)
			{
				results=Collections.singletonList(cByEmail);
			}
			break;
		case "lastName":
			    results=service.findAllByLastName(searchValue);
			    break;
		}
		
		ResponseEntity<List<Contact>> resp;
		
		if(results==null)
			resp= new ResponseEntity<List<Contact>>(HttpStatus.BAD_REQUEST);
		else
			resp= new ResponseEntity<List<Contact>>(results,HttpStatus.OK);
		
		return resp;
	}*/
	
	@PostMapping
	public ResponseEntity<Employee> addContact(@RequestBody Employee employee)
	{
		ResponseEntity<Employee> resp=null;
		
		if(service.existsByDept(employee.getDept()))
		{
			Employee c= service.addEmployee(employee);
		    resp=new ResponseEntity<Employee>(HttpStatus.OK);
		}
		
		
		if(resp==null)
		{
			Employee c= service.addEmployee(employee);
			if(c==null)
				resp=new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
			else
				resp=new ResponseEntity<Employee>(HttpStatus.OK);
		}
		return resp;
		
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateContact(@RequestBody Employee employee)
	{
		ResponseEntity<Employee> resp=null;
		Employee c= service.getEmployeeById(employee.getEmpId());
		if(!employee.getDept().equals(c.getDept()))
		{
		if(service.existsByDept(employee.getDept()))
		{
		    resp=new ResponseEntity<Employee>(HttpStatus.OK);
		}
		}
		
		
		if(resp==null)
		{
			c=service.updateEmployee(employee);
			
			if(c==null)
				resp=new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
			else
				resp=new ResponseEntity<Employee>(HttpStatus.OK);
		}
		return resp;
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteContact(@PathVariable("id") int empId)
	{
		ResponseEntity<Void> resp = null;
		
		if(service.deleteEmployee(empId))
		 resp=new ResponseEntity<>(HttpStatus.OK);
		else
		  resp=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		return resp;
	}


}
