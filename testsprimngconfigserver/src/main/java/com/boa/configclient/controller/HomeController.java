package com.boa.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HomeController {
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;

	
	@Value("${msg}")
	private String message;
	
	@RequestMapping("/showConfig")
	@ResponseBody
	public String showConfig() {
		String configinfo = "<br/>spring.datasource.driver-class-name=" +driverClassName
				+"<br/>spring.datasource.url="+url
				+"<br/>spring.datasource.username="+username
				+"<br/>spring.datasource.password="+password
				+"<br/>msg="+message;
		return configinfo;
	}
}
