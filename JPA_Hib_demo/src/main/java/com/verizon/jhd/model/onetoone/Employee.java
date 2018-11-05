package com.verizon.jhd.model.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name= "employees2")
public class Employee {

	@Id
	private int empId;
    private String name;
    private double basic;
    @OneToOne(mappedBy="accountHolder" ,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    public BankAccount salaryAccount;
	public Employee(int empId, String name, double basic) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
		
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public BankAccount getSalaryAccount() {
		return salaryAccount;
	}
	public void setSalaryAccount(BankAccount salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
    
    
}
