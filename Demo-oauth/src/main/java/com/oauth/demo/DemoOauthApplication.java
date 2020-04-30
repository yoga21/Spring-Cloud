package com.oauth.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class DemoOauthApplication {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+"welcome to springClouthOath2ExampleApplication";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOauthApplication.class, args);
	}

}
