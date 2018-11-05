package com.verizon.service;

import com.verizon.model.Loan;

public class LoanService {
	
	private double interest;
	private double amount;
	
	public double getInterest(double p,double r,double t)
	{
		
		
		this.interest=(p*r*t)/100;
		
		return  this.interest;
	}
	
	public double getPayableAmount(double p,double r,double t)
	{
		this.amount=p+((p*r*t)/100);
		
		return this.amount;
	}
	
	
	

}
