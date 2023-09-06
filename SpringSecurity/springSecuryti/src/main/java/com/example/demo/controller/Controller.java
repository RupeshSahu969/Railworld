package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/app")
public class Controller {
 
	@GetMapping("/welcom")
	public String welcom() {
		return "Welcom to the spring Security";
	}
	
	@GetMapping("/all")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String all() {
		return "Welcom to the role user";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String admin() {
		return "Welcom to the admin admin";
	}
}
