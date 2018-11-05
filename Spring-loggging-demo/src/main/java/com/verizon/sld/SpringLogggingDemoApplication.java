package com.verizon.sld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLogggingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLogggingDemoApplication.class, args);
		
        Logger log=LoggerFactory.getLogger("some category");
        log.info("aaaahheehaaaa");
		
	}
}
