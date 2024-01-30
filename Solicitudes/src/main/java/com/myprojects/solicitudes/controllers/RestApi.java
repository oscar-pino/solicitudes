package com.myprojects.solicitudes.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {
	
	@GetMapping("/hello")
	String home() {
		
		return "sin seguridad";
	}
	
	@GetMapping("/hello2")
	String home2() {
		
		return "sin seguridad2";
	}
	
	@GetMapping("/security")
	private String seguridad() {
		
		return "login";
	}
}
