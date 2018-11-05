package com.verizon.service;

public class MorningService {
	
	
	public String morningService(String username)
	{
		String greeting=null;
		if(username!=null)
		{
			return "Good Morning "+username;
		}
		return greeting;
	}

}
