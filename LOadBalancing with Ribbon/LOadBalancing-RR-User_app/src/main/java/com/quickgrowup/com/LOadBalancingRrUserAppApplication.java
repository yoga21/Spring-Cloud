package com.quickgrowup.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RibbonClient(name="LOadBalancing-RR-App" ,configuration=RibbonConfiguration.class)
public class LOadBalancingRrUserAppApplication {
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/invoke")
	public String invokeRR(){
		
		String url="http://LOadBalancing-RR-App/msg-app/msg";
		return template.getForObject(url,String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(LOadBalancingRrUserAppApplication.class, args);
	}

	
	//user_app call to RR-App using rest template
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
		
		
	}
}
