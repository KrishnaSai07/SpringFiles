package com.verizon.model;

public abstract class Loan {
	
	private int loanId;
	private int amount;
	private int termCount;
	
	public abstract void setData(int loanId,int amount,int termCount);
	

}
