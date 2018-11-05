package com.verizon.service;

import java.util.List;

import com.verizon.model.Packages;
import com.verizon.model.User;

public interface CommonService {
	
	User addUser(User user);
	List<Packages> getAllPackages();
	
	boolean existByNetspeed(String netspeed);
	boolean existsByMaxusage(String maxusage);
	boolean existByCharge(String charges);
	Packages findByNetspeed(String netspeed);
	Packages findByMaxusage(String maxusage);
	Packages findByCharge(String charges);

}
