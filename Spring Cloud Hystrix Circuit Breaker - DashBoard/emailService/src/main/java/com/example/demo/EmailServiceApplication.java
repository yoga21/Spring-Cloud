package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/emailService")
public class EmailServiceApplication {

	@GetMapping("/send")
	public String SendEmail() {
		return "Email sevice called.....!";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
