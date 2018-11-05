package com.verizon.jhd.model.isa;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="etype",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")
@Table(name="AllEmps")*/
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name ="EMPS2")
public class Emp {

	@Id
	private int empId;
	private String name;
	private int basic;
	
	
	
	public Emp() {
		super();
	}
	
	
	public Emp(int empId, String name, int basic) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
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
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	
}
