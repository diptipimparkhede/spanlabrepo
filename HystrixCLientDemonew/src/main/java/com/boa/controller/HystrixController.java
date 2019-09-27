package com.boa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
	
	@Autowired
	private HystrixDelegate hystrixDelegate;
	
	 @CrossOrigin("*")
	@GetMapping("/hystrixgetCustomerById/{id}")
	public String hystrixgetCustomerById(@PathVariable("id") int id) {
		return this.hystrixDelegate.handleRequest(id);
	}

}
