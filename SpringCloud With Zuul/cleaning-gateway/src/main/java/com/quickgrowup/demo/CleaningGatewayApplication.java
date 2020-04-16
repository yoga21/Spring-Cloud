package com.quickgrowup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CleaningGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleaningGatewayApplication.class, args);
	}

}
