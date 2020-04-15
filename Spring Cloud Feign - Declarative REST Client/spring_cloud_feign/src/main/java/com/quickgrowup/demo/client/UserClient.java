package com.quickgrowup.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.quickgrowup.demo.dto.Example;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {

	@GetMapping("/users")
	public List<Example>getUser();
}