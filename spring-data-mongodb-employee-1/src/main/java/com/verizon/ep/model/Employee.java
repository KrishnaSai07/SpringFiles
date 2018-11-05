package com.verizon.ep.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employees")
public class Employee {

	  @Id
      private int empId;
      //name,basic,hra,dept
	  @NotEmpty(message= " it can't be empty")
      private String empName;
      @NotNull(message="basic cant be lefy blank")
      private int basic;
      @NotNull(message="basic cant be lefy blank")
      private int hra;
      @NotEmpty(message= " it can't be empty")
      private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
      
      
      
      
      
}
