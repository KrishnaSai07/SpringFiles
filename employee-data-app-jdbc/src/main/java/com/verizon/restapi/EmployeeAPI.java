package com.verizon.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Employee;
import com.verizon.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeAPI {
	@Autowired
	private EmployeeService empService;

	@GetMapping
	public ResponseEntity<List<Employee>> listEmployeesAction() {
		return new ResponseEntity<List<Employee>>(empService.getAllEmployees(),HttpStatus.OK);
	}

	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getBookAction(@PathVariable("empId") int empId) {
		ResponseEntity<Employee> resp = null;
		Employee b = empService.getEmployeeById(empId);
		if (b == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(b, HttpStatus.OK);
		return resp;
	}

	@DeleteMapping("/{empId}")
	public ResponseEntity<Void> deleteBookAction(@PathVariable("empId") int empId) {
		ResponseEntity<Void> resp = null;

		boolean isDeleted = empService.deleteEmployeeById(empId);

		if (!isDeleted)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(HttpStatus.OK);
		return resp;
	}

	@PostMapping
	public ResponseEntity<Employee> addBookAction(@RequestBody Employee employee) {
		ResponseEntity<Employee> resp = null;
		employee = empService.addEmployee(employee);

		if (employee != null)
			resp = new ResponseEntity<>(employee, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return resp;
	}

	@PutMapping
	public ResponseEntity<Employee> updateBookAction(@RequestBody Employee employee) {
		ResponseEntity<Employee> resp = null;

		if (empService.getEmployeeById(employee.getEmpId()) == null) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			employee = empService.updateEmployee(employee);

			if (employee != null)
				resp = new ResponseEntity<>(employee, HttpStatus.OK);
			else
				resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

}
