package com.verizon.ep.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.verizon.ep.model.Employee;
import com.verizon.ep.service.EmployeeService;

public class EmployeeController {

		@Autowired
		private EmployeeService employeeService;
		
		@GetMapping("/employeeList")
		public ModelAndView handleContactList()
		{
			return new ModelAndView("clistPage","employees",employeeService.getAllEmployees());
		}
		
		@GetMapping("/addEmployee")
		public ModelAndView handleNewContact()
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("addEmployeePage");
			mv.addObject("employee",new Employee());
			
			
			return mv;
			
		}
		
		@PostMapping("/addEmployee")
		public ModelAndView handleAddContact(@ModelAttribute("employee")  @Valid Employee employee,
				BindingResult validationResults)
		{
			ModelAndView mv=new ModelAndView();
			
			if(validationResults.hasErrors())
			{
				mv.setViewName("addEmployeePage");
				mv.addObject("employee",employee);
				
				
			}
			else 
			{
				employeeService.addEmployee(employee);
				mv.setViewName("redirect:/employeeList");
				
			}
			return mv;
			
		}
		
		
	}

	

