package com.verizon.sdr.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="employees")
public class Employee {
	
	@Id
	private Long empId;
	private String empNmae;
	private int basic;
	private int hra;
	private String dept;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpNmae() {
		return empNmae;
	}
	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
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
