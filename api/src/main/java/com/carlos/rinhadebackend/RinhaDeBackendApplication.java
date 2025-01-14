package com.carlos.rinhadebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RinhaDeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RinhaDeBackendApplication.class, args);
	}

}
