package com.verizon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "package1")
public class Packages {
	
	@Id
	private String p_title;
	@NotEmpty(message= " it can't be empty")
	private String netspeed;
	@NotEmpty(message= " it can't be empty")
	private String maxusage;
	@NotNull(message= " it can't be empty")
	private int charge;
	
	
	
	
	public Packages() {
		super();
	}
	public Packages(String p_title,String netspeed, String maxusage,int charge) {
		super();
		this.p_title = p_title;
		this.netspeed = netspeed;
		this.maxusage = maxusage;
		this.charge = charge;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getNetspeed() {
		return netspeed;
	}
	public void setNetspeed(String netspeed) {
		this.netspeed = netspeed;
	}
	public String getMaxusage() {
		return maxusage;
	}
	public void setMaxusage(String maxusage) {
		this.maxusage = maxusage;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	
	






	
	

}
