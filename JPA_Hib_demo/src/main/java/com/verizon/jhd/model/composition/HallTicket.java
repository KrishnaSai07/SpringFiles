package com.verizon.jhd.model.composition;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "halltickets1")
public class HallTicket {

	@Id
	private String hallticketnumber;
	private String candidtaename;
	private String examtitle;
	@Embedded
	private Identification identify;
	
	
	
	public HallTicket() {
		super();
	}



	public HallTicket(String hallticketnumber, String candidtaename, String examtitle, Identification identify) {
		super();
		this.hallticketnumber = hallticketnumber;
		this.candidtaename = candidtaename;
		this.examtitle = examtitle;
		this.identify = identify;
	}



	public String getHallticketnumber() {
		return hallticketnumber;
	}



	public void setHallticketnumber(String hallticketnumber) {
		this.hallticketnumber = hallticketnumber;
	}



	public String getCandidtaename() {
		return candidtaename;
	}



	public void setCandidtaename(String candidtaename) {
		this.candidtaename = candidtaename;
	}



	public String getExamtitle() {
		return examtitle;
	}



	public void setExamtitle(String examtitle) {
		this.examtitle = examtitle;
	}



	public Identification getIdentify() {
		return identify;
	}



	public void setIdentify(Identification identify) {
		this.identify = identify;
	}
	
	
	
	
	
}
