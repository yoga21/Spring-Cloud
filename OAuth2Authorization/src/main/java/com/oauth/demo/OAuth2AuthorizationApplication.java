package com.oauth.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oauth.demo.entity.User;
import com.oauth.demo.repository.UserRepository;

@SpringBootApplication

public class OAuth2AuthorizationApplication {

	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUsers() {
		
		
		List<User> users=Stream.of(
				
			new User(101,"suyog","cool@21","suyog@gmail.com"),
			new User(102,"yog","yog@21","yog@gmail.com"),
			new User(103,"cool","go@21","go@gmail.com"),
			new User(104,"rohit","rohit@21","rohit@gmail.com"),
			new User(105,"hit","hit@21","suyog@gmail.com")	
				
				
				).collect(Collectors.toList());
				
		repository.saveAll(users);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OAuth2AuthorizationApplication.class, args);
	}

}
