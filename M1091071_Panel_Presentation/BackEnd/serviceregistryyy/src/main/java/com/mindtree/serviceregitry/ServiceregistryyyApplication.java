package com.mindtree.serviceregitry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregistryyyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistryyyApplication.class, args);
	}

}
