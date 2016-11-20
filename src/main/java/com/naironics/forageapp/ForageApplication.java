package com.naironics.forageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ForageApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ForageApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ForageApplication.class);
    }
	
	
	@RequestMapping(path = "/")
    	public String hello() {
        	return "Hello from Forage App";
    	}

}
