package com.quickgrowup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KitchenCleanServiceApplication {

	
	@GetMapping("/getKitchen-Clean")
	public String getKitchenCleaning() {
		return "Kitchen-Clean microservice called.....!";
		
		
	}
	public static void main(String[] args) {
		SpringApplication.run(KitchenCleanServiceApplication.class, args);
	}

}
