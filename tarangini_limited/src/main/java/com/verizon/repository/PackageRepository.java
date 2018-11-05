package com.verizon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.model.Packages;

@Repository
public interface PackageRepository extends JpaRepository<Packages, Integer> {
	
	boolean existsByNetspeed(String netspped);
	boolean existsByMaxusage(String maxusage);
	boolean existsByCharge(String charges);
	Packages findByNetspeed(String netspeed);
	Packages findByMaxusage(String maxusage);
	Packages findByCharge(String charge);

}
