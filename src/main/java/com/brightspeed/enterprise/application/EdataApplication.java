package com.brightspeed.enterprise.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.brightspeed")

public class EdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdataApplication.class, args);
	}

}
