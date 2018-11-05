package com.verizon;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verizon.cache.PersonRepository;

@SpringBootApplication
public class SpringBootCacheApplication implements CommandLineRunner {

	private static final Logger logger=LoggerFactory.getLogger(SpringBootCacheApplication.class);
	@Autowired
	private PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
