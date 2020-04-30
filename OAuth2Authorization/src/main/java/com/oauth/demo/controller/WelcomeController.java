package com.oauth.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oauth.demo.entity.AuthRequest;
import com.oauth.demo.util.JwtUtil;

@RestController
public class WelcomeController {

	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager ;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to quickgrowup....!";
	}
	
	
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		
		
		try {
		authenticationManager.authenticate(
				
				new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword())
				
				
				);
		}catch(Exception ex) {
			
			throw new Exception("in  valid username/password");
		}
		
		
		return jwtUtil.generateToken(authRequest.getUserName());
		
		
	}
}
