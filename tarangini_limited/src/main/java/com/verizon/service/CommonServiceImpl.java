package com.verizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.model.Packages;
import com.verizon.model.User;
import com.verizon.repository.PackageRepository;
import com.verizon.repository.UserRepository;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private PackageRepository packageRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<Packages> getAllPackages() {
		// TODO Auto-generated method stub
		return packageRepo.findAll();
	}

	@Override
	public boolean existByNetspeed(String netspped) {
		// TODO Auto-generated method stub
		return packageRepo.existsByNetspeed(netspped);
	}

	@Override
	public boolean existsByMaxusage(String maxusage) {
		// TODO Auto-generated method stub
		return packageRepo.existsByMaxusage(maxusage);
	}

	@Override
	public boolean existByCharge(String charges) {
		// TODO Auto-generated method stub
		return packageRepo.existsByCharge(charges);
	}

	@Override
	public Packages findByNetspeed(String netspeed) {
		// TODO Auto-generated method stub
		return packageRepo.findByNetspeed(netspeed);
	}

	@Override
	public Packages findByMaxusage(String maxusage) {
		// TODO Auto-generated method stub
		return packageRepo.findByMaxusage(maxusage);
	}

	@Override
	public Packages findByCharge(String charges) {
		// TODO Auto-generated method stub
		return packageRepo.findByCharge(charges);
	}

}
