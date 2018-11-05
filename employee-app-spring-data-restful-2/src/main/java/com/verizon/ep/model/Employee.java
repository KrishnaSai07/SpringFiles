package com.verizon.ep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private long empId;
      //name,basic,hra,dept
	  @NotEmpty(message= " it can't be empty")
      private String empName;
      @NotNull(message="basic cant be lefy blank")
      private int basic;
      @NotNull(message="basic cant be lefy blank")
      private int hra;
      @NotEmpty(message= " it can't be empty")
      private String dept;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
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
