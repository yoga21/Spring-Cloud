package com.quickgrowUp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RechargeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RechargeConfigServerApplication.class, args);
	}

}
