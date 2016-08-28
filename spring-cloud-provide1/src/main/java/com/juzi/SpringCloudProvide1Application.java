package com.juzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProvide1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvide1Application.class, args);
	}
}
