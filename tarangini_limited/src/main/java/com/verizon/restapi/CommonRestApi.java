package com.verizon.restapi;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Packages;
import com.verizon.model.User;
import com.verizon.service.CommonService;

@RestController
@CrossOrigin
public class CommonRestApi {

	@Autowired
	private CommonService coms;
	
	@RequestMapping("/packages")
	@GetMapping
	public ResponseEntity<List<Packages>> getAllPackages()
	{
		return new ResponseEntity<>(coms.getAllPackages(),HttpStatus.OK);
		
	}
	
	@RequestMapping("/user")
	@PostMapping
	public ResponseEntity<User> addUserAction(@RequestBody User user)
	{
		
		return new ResponseEntity<>(coms.addUser(user),HttpStatus.OK);
	
		
	}
	
	
	@GetMapping("/packages/{field}/{srhValue}")
	public ResponseEntity<List<Packages>> getAllPacksByValue(
			@PathVariable("field") String fieldBy,
			@PathVariable("srhValue") String searchValue)
	{
		List<Packages> results = null;
		
		switch(fieldBy)
		{
		case "netspeed":
			 Packages cByNetspeed = coms.findByNetspeed(searchValue);
			if(cByNetspeed!=null)
			{
				results= Collections.singletonList(cByNetspeed);
			}
			break;
		case "maxusage":
			Packages cByMaxusage = coms.findByMaxusage(searchValue);
			if(cByMaxusage!=null)
			{
				results=Collections.singletonList(cByMaxusage);
			}
			break;
		case "charge":
			Packages cByCharges = coms.findByCharge(searchValue);
			if(cByCharges!=null)
			{
				results=Collections.singletonList(cByCharges);
			}
			   
			    break;
		}
		
		ResponseEntity<List<Packages>> resp;
		
		if(results==null)
			resp= new ResponseEntity<List<Packages>>(HttpStatus.BAD_REQUEST);
		else
			resp= new ResponseEntity<List<Packages>>(results,HttpStatus.OK);
		
		return resp;
	}

	
	
}
