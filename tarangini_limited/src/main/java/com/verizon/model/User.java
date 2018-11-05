package com.verizon.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customId;
	@NotEmpty(message= " it can't be empty")
	private String name;
	@NotEmpty(message= " it can't be empty")
	private String mobileNumber;
	@NotEmpty(message= " it can't be empty")
	private String timeslot;
	@NotEmpty(message= " it can't be empty")
	private String address;
	
	private LocalDate dateOfInterest;
	
	public User() {
		super();
	}






	public User(int customId, String name, String mobileNumber, String timeslot, String address) {
		super();
		this.customId = customId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.timeslot = timeslot;
		this.address = address;
	}






	public int getCustomId() {
		return customId;
	}






	public void setCustomId(int customId) {
		this.customId = customId;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getMobileNumber() {
		return mobileNumber;
	}






	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}






	public String getTimeslot() {
		return timeslot;
	}






	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDate getDateOfInterest() {
		return dateOfInterest;
	}






	public void setDateOfInterest(LocalDate dateOfInterest) {
		this.dateOfInterest = dateOfInterest;
	}

	
	
	

}
