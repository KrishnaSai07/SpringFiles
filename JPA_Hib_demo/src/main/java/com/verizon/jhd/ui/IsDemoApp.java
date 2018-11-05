package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.isa.ContractEmployee;
import com.verizon.jhd.model.isa.Emp;
import com.verizon.jhd.model.isa.Manager;
import com.verizon.jhd.util.JPAUtil;

public class IsDemoApp {
	
	public static void main(String args[])
	{
		
		
		Emp emp1=new Emp(101,"RAM",2345);
		ContractEmployee emp2= new ContractEmployee(102,"SOMU",4563,45);
		Manager emp3=new Manager(103,"shyam",4567,5678);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		txn.commit();
		System.out.println("Data Persisted");
		JPAUtil.shutdown();
		
		
		
	} 

}
