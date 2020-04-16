package com.quickgrowup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CleaningServiceApplication {

	@GetMapping("/getcleanService")
	public String getCleaningService() {
		return "CleanningService microservice is called ..........!";
		
	}
	
	
	@GetMapping("/Suggetion/{msg}")
	public String wish(@PathVariable String msg) {
		return "This" +msg+"Gives suggetion msg";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(CleaningServiceApplication.class, args);
	}

}
