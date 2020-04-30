package com.oauth.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GretingController {

	
	@Value("${my.greeting :defualt value}")
	private String greetingMessages;
	
	
	
@Value("${my.list.values}")
private List<String> valueList;
	
	@Value("Welcome to quickgrowUp")
	private String greet;
	
	@Autowired
	private DbSettings dbSettings;
	
	@GetMapping("/greeting")
	public String greeting() {
		
		
		return dbSettings.getConnection() + dbSettings.getHost() +dbSettings.getPort();
	}
	
	
	
	
}
