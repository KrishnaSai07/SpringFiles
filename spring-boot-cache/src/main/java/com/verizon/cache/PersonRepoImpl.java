package com.verizon.cache;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepoImpl implements PersonRepository{

	@Override
	
	public Person getDetails(String name) {
		// TODO Auto-generated method stub
		return new Person("name","Any person");
	}
	
	public void delay() 
	{
		try {
		Thread.sleep(1000);
	    }
		catch(InterruptedException x)
		{
			System.out.println("invalid" );
		}
	}

}
