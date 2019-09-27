package com.boa.kycprocess.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Endpoint(id="kycbeans")
public class KYCEndPoint {
	@Autowired
		private ApplicationContext context;
	
	@ReadOperation
	@Bean
	public String[] getAllNames() {
		return this.context.getBeanDefinitionNames();
	}
}
