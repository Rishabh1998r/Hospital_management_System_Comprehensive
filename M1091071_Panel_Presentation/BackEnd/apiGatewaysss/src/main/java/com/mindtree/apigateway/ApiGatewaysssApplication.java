package com.mindtree.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewaysssApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaysssApplication.class, args);
	}

}
