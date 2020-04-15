package com.quickgrowup.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/msg-app")
public class LOadBalancingRrAppApplication {

	
	@Value("${server.port}")
	private String port;
	@GetMapping("/msg")
	public String SendMsg() {
		return "Application running on port:"+port;
		
		
	}
	public static void main(String[] args) {
		SpringApplication.run(LOadBalancingRrAppApplication.class, args);
	}

}
