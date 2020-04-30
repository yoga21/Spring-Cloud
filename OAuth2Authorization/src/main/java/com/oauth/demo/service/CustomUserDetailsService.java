package com.oauth.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oauth.demo.entity.User;
import com.oauth.demo.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	
	
	@Autowired
	private UserRepository userReposiotory;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	User user=	userReposiotory.findByUserName(username);
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),new ArrayList<>());
	}

}
