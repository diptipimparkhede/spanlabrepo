package com.boa.HystrixCLientDemonew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
public class HystrixCLientDemonewApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixCLientDemonewApplication.class, args);
	}

}
