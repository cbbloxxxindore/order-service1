package com.vanguard.orederservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrederServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrederServiceApplication.class, args);
	}

}
