package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${math.number1}")
	private int number1;
	@Value("${math.number2}")
	private int number2;
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/add")
	public String add() {
		return "sum of "+number1+" and "+number2+" is "+ (number1+number2);
	}
}
