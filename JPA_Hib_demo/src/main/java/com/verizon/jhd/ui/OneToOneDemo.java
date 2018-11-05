package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.onetoone.BankAccount;
import com.verizon.jhd.model.onetoone.Employee;
import com.verizon.jhd.util.JPAUtil;

public class OneToOneDemo {
	
	public static void main(String args[])
	{
		
		Employee emp=new Employee(103,"Ramu",3445546);
		BankAccount acc=new BankAccount("SBOO1","SBI","SB0009");
		emp.setSalaryAccount(acc);
		acc.setAccountHolder(emp);
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(emp);
		
		txn.commit();
		System.out.println("Data Persisted");
		JPAUtil.shutdown();
	}
		
	}


