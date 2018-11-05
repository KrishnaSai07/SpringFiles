package com.skilltrace.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CourseEmployee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long skillId;
	
	@NotEmpty(message="Name can not be empty")
	private String skillName;
	
	@NotNull(message="Cannot be empty")
	private long employeeId;
	
	@NotEmpty(message="Name can not be empty")
	private String employeeName;
	
	@NotEmpty(message="Cannot be empty")
	private String status;

	public CourseEmployee() {
		super();
	}

	public CourseEmployee(long skillId,String skillName,long employeeId,String employeeName,String status) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.status = status;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
