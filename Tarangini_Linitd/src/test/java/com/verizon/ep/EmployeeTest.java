package com.verizon.ep;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.verizon.ep.model.Employee;
import com.verizon.ep.restapi.EmployeeAPI;
import com.verizon.ep.service.EmployeeService;
import com.verizon.ep.test.TestUtil;



@RunWith(SpringRunner.class)
@WebMvcTest(controllers = EmployeeAPI.class)
public class EmployeeTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@MockBean
	private EmployeeService empServiceMock;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@After
	public void tearDown() {
		mockMvc = null;
	}
	@Test
	public void testGetAllEmployees() throws Exception{
		
		assertThat(this.empServiceMock).isNotNull();

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee());

		when(empServiceMock.getAllEmployees()).thenReturn(empList);

		mockMvc.perform(get("/employees")).andExpect(status().isOk()).andDo(print());

	}
   
	@Test
	public void testGetContactById() throws Exception {
		assertThat(this.empServiceMock).isNotNull();
		int empId = 1;
	

		Employee empAdded = new Employee();

		empAdded.setEmpId(1);
		empAdded.setEmpName("kevin");
		empAdded.setBasic(230000);
		empAdded.setHra(12);
		empAdded.setDept("IT");

		when(empServiceMock.getEmployeeById(empId)).thenReturn(empAdded);

		mockMvc.perform(get("/employees/1")).andExpect(status().isOk()).andDo(print());
	}
	

	@Test
	public void testAddContact() throws Exception {
		assertThat(this.empServiceMock).isNotNull();
		
		
		Employee emp = new Employee();
		emp.setEmpName("Raima");
		emp.setBasic(8977);
		emp.setHra(45);
		emp.setDept("HR");

		Employee empAdded = new Employee();
		empAdded.setEmpId(14);
		empAdded.setEmpName("Raima");
		empAdded.setBasic(8977);
		empAdded.setHra(45);
		empAdded.setDept("HR");


		when(empServiceMock.addEmployee(Mockito.any(Employee.class))).thenReturn(empAdded);

		mockMvc.perform(post("/employees").contentType(TestUtil.APPLICATION_JSON_UTF8)
				.content(TestUtil.convertObjectToJsonBytes(emp))).andDo(print()).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8));

	}
	
	

	@Test
	public void testUpdateContact() throws Exception{
		
		assertThat(this.empServiceMock).isNotNull();

		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("kevin De Bryne");
		emp.setBasic(23000);
		emp.setHra(12);
		emp.setDept("IT");

		int empId = 1;
		

		Employee empAdded = new Employee();

		empAdded.setEmpId(1);
		empAdded.setEmpName("kevin");
		empAdded.setBasic(230000);
		empAdded.setHra(12);
		empAdded.setDept("IT");

		when(empServiceMock.getEmployeeById(empId)).thenReturn(empAdded);

		when(empServiceMock.updateEmployee(Mockito.any(Employee.class))).thenReturn(emp);

		mockMvc.perform(put("/employees").contentType(TestUtil.APPLICATION_JSON_UTF8)
				.content(TestUtil.convertObjectToJsonBytes(emp))).andDo(print()).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8));

		
	}
   
	@Test
	public void testDeleteContact() throws Exception {
		assertThat(this.empServiceMock).isNotNull();

		int empId = 4;

		when(empServiceMock.deleteEmployee(empId)).thenReturn(true);

		mockMvc.perform(delete("/employees/4")).andExpect(status().isOk()).andDo(print());

		
	}
	

}
