package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

	@RequestMapping("/")
	public String simpleIndex() {
		return "Hello World";
	}
	
	@RequestMapping("/test")
	public String indexWithParamRequest(@RequestParam(value="greeting", required=false) String greeting) {
		
		if (greeting == null) {
			greeting = "No greeting today!";
		}
		
		return greeting;
	}
	
	@RequestMapping("/test/{hello}")
	public String indexWithPathVariable(@PathVariable(value="hello", required=false) String hello) {
		
		return hello;
	}

}