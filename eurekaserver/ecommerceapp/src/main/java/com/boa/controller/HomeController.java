package com.boa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	

	  @GetMapping("/Home") 
	  public String home() { 
		  return "YOu are at Home"; 
	  }
	 

}
