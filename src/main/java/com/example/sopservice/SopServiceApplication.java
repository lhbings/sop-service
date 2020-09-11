package com.example.sopservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.example.sopservice.dao")
@EnableSwagger2
public class SopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SopServiceApplication.class, args);
	}

}
