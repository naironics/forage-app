package com.naironics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ForageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForageAppApplication.class, args);
	}
	
	
	@RequestMapping(path = "/")
    	public String hello() {
        	return "Hello from Forage App";
    	}

}
