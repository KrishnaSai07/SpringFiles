package com.verizon.jhd.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.o2mm2o.Course;
import com.verizon.jhd.model.o2mm2o.Participant;
import com.verizon.jhd.util.JPAUtil;

public class OneToMany {
	
	public static void main(String args[])
	{
		Course jsCourse= new Course("js","JAVA SE");
		Course jeCourse = new Course("je","JAVA EE");
		
		Participant p1=new Participant(101,"Srinu",jeCourse);
		Participant p2=new Participant(102,"rinu",jeCourse);
		Participant p3=new Participant(103,"Sinu",jeCourse);
		Participant p4=new Participant(104,"Sriu",jeCourse);
		Participant p5=new Participant(105,"Sniu",jeCourse);
		
		jsCourse.setParticipants(new TreeSet<>());
		jsCourse.getParticipants().add(p3);
		jsCourse.getParticipants().add(p4);
		jsCourse.getParticipants().add(p5);
		
		jeCourse.setParticipants(new TreeSet<>());
		jeCourse.getParticipants().add(p1);
		jeCourse.getParticipants().add(p2);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();		
		EntityTransaction txn = em.getTransaction();		
		txn.begin();			
		em.persist(jsCourse);			
		em.persist(jeCourse);			
		txn.commit();			
		System.out.println("Data Persisted");			
		JPAUtil.shutdown();	}

		
		
		
	}


