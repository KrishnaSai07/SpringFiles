package com.verizon.jhd.model.isa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("memp")
@Table(name="MEMPS2")
public class Manager extends Emp {
	
	private int allowance;
	
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public Manager()
	{
		
	}
	
	public Manager(int empId, String ename, int basic,int allowance)
	{
		super(empId, ename, basic);
		this.allowance=allowance;
	}
	

}
