package com.verizon.jhd.model.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="bankaccount2")
public class BankAccount {

	@Id
	private String accnum;
	private String bankTitle;
	private String ifscode;
	
	@OneToOne
	@JoinColumn(name = "accHoldername")
	private Employee accountHolder;

	public BankAccount() {
		super();
	}
	public BankAccount(String accnum, String bankTitle, String ifscode) {
		super();
		this.accnum = accnum;
		this.bankTitle = bankTitle;
		this.ifscode = ifscode;
	}

	 

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public String getBankTitle() {
		return bankTitle;
	}

	public void setBankTitle(String bankTitle) {
		this.bankTitle = bankTitle;
	}

	public String getIfscode() {
		return ifscode;
	}

	public void setIfscode(String ifscode) {
		this.ifscode = ifscode;
	}

	public Employee getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Employee accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	
	
}
