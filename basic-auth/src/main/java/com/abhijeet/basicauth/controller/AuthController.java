package com.abhijeet.basicauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
	
}
