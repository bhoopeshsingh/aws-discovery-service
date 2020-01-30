package com.ms.discovery.service.awsdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class AwsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDiscoveryServiceApplication.class, args);
	}

}
