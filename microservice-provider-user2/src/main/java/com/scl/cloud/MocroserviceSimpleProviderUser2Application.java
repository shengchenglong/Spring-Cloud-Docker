package com.scl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class MocroserviceSimpleProviderUser2Application {

	public static void main(String[] args) {
		SpringApplication.run(MocroserviceSimpleProviderUser2Application.class, args);
	}
}
