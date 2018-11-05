package com.verizon.jhd.model.composition;

import javax.persistence.Embeddable;

@Embeddable
public class Identification {

	private String photoFilename;
	private String fingerPrints;
	
	
	
	public Identification() {
		super();
	}



	public Identification(String photoFilename, String fingerPrints) {
		super();
		this.photoFilename = photoFilename;
		this.fingerPrints = fingerPrints;
	}



	public String getPhotoFilename() {
		return photoFilename;
	}



	public void setPhotoFilename(String photoFilename) {
		this.photoFilename = photoFilename;
	}



	public String getFingerPrints() {
		return fingerPrints;
	}



	public void setFingerPrints(String fingerPrints) {
		this.fingerPrints = fingerPrints;
	}
	
	
	
}
