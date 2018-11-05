package com.verizon.jhd.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.composition.HallTicket;
import com.verizon.jhd.model.composition.Identification;
import com.verizon.jhd.util.JPAUtil;

public class SaveHall {

	public static void main(String args[])
	{
		Identification i1=new Identification("photo1.jpg","fingerp.jpg");
		
		HallTicket h1=new HallTicket("230995","Mandy","Social",i1);
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(h1);
		
		txn.commit();
		System.out.println("Data Persisted");
		JPAUtil.shutdown();
		
		
	}
}
