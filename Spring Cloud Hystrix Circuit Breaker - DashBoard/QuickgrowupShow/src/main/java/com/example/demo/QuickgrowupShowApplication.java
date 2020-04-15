package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class QuickgrowupShowApplication {

	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(groupKey="quickgrowup",commandKey="uickgrowup",fallbackMethod="bookShowFallBack")
	@GetMapping("/bookNow")

	public String  bookShow() {
		
		String emailResponse=template.getForObject("http://localhost:8081/emailService/send",String.class);
		
		String paytmResponse=template.getForObject("http://localhost:8082/paytm/pay",String.class);
		return  emailResponse +"/n"+ paytmResponse ;
	}
	
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(QuickgrowupShowApplication.class, args);
	}
	
	public String bookShowFallBack() {
		
		return "service gatewayfailed....!";
	}
	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}

}
