package com.quickgrowup.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroStudentServiceApplication.class, args);
	}

}
