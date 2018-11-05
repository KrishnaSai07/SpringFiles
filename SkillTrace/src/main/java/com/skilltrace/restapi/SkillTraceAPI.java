package com.skilltrace.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilltrace.model.Employee;
import com.skilltrace.model.EmployeeSkill;
import com.skilltrace.model.Skill;
import com.skilltrace.model.SkillRequest;
import com.skilltrace.service.EmployeeService;
import com.skilltrace.service.EmployeeSkillService;
import com.skilltrace.service.SkillRequestService;
import com.skilltrace.service.SkillService;

@CrossOrigin
@RestController
public class SkillTraceAPI {
	
	@Autowired
	private SkillService skillService;
	
	@Autowired
	private SkillRequestService skillreqt;
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeSkillService empSkillService;
	
	@RequestMapping("/skill")
	@GetMapping()
	public ResponseEntity<List<Skill>> getAllSkillsAction()
	{
		return new ResponseEntity<>(skillService.getAllSkills(),HttpStatus.OK);
	}
	
	@RequestMapping("/EmployeeRequest")
	@GetMapping()
	public ResponseEntity<List<SkillRequest>> getAllEmployeeRequests(){
		return new ResponseEntity<>(skillreqt.getAllSkillRequests(),HttpStatus.OK);
	}
	
	@RequestMapping("/EmployeeData")
	@GetMapping()
	public ResponseEntity<List<Employee>> getAllEmployeesData(){
		return new ResponseEntity<>(empService.getAllEmployee(),HttpStatus.OK);
	}
	
	@RequestMapping("/EmployeeSkill")
	@GetMapping()
	public ResponseEntity<List<EmployeeSkill>> getAllEmployeesSkillsData(){
		return new ResponseEntity<>(empSkillService.getAllEmployeeSkills(),HttpStatus.OK);
	}
	
	
	@GetMapping("/EmployeeRequest/{id}")
	public ResponseEntity<SkillRequest> getSkillRequestById(@PathVariable("id") long requestId)
	{
		ResponseEntity<SkillRequest> resp;
		SkillRequest c = skillreqt.getRequestById(requestId);
		if(c == null)
			resp=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp=new ResponseEntity<>(c,HttpStatus.OK);
		return resp;
		
	}
	
	@GetMapping("/EmployeeData/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId)
	{
		ResponseEntity<Employee> resp;
		Employee c = empService.getRequestById(employeeId);
		if(c == null)
			resp=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp=new ResponseEntity<>(c,HttpStatus.OK);
		return resp;
		
	}
	
	
	
	@DeleteMapping("/EmployeeRequestDel/{id}")
	public ResponseEntity<Void> deleteRequest(@PathVariable("id") long requestId)
	{
		ResponseEntity<Void> resp = null;
		
		if(skillreqt.deleteSkillRequest(requestId ))
		 resp=new ResponseEntity<>(HttpStatus.OK);
		else
		  resp=new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		return resp;
	}
	
	}
