package com.example.sopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SopServiceApplication.class, args);
	}

}
