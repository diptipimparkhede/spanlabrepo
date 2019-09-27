package com.boa.kycprocess.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.kyc.filters.KYCFilter;

@Configuration
public class FilterConfiguration {
	
	@Bean
	public FilterRegistrationBean<KYCFilter> register() {
		// TODO Auto-generated method stub
		 FilterRegistrationBean<KYCFilter> reg = new  FilterRegistrationBean<KYCFilter>();
		 KYCFilter filter = new KYCFilter();
		 reg.setFilter(filter);
		 reg.addUrlPatterns("/");
		 reg.setOrder(1);
		 return reg;
	}

}
