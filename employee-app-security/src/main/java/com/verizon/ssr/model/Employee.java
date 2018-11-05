package com.verizon.ssr.model;



public class Employee {

	  
      private int  empId;
      private String empName;
      private int basic;
      private int hra;
      private String dept;
	public int getEmpId() {
		return empId;
	}
	public Employee()
    {
        
    }
    
    public Employee(int empId, String empName, int basic, int hra, String dept) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.basic = basic;
        this.hra = hra;
        this.dept = dept;
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
