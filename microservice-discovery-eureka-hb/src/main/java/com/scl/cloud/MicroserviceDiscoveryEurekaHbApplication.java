package com.scl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryEurekaHbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekaHbApplication.class, args);
	}
}
