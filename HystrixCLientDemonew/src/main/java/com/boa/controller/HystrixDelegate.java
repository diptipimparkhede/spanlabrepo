package com.boa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public class HystrixDelegate {
	@Autowired
	private RestTemplate restTemplate;
	
	public String handleRequest(int id) {
		
		String response = restTemplate.exchange("http://localhost:7060/getcustomerbyid/1"
				, HttpMethod.GET
				, null
				, new ParameterizedTypeReference<String>() {
			
		},id).getBody();
		
		return response;
				
	}
	
	
public String handleFallback(int id) {
		
		String response = restTemplate.exchange("http://localhost:7061/getcustomerbyid/1"
				, HttpMethod.GET
				, null
				, new ParameterizedTypeReference<String>() {
			
		},id).getBody();
		
		return response;
				
	}

@Bean
public RestTemplate getInstance() {
	return new RestTemplate();
}
}
