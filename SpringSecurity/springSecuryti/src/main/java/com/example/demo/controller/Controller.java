package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
@RestController
@RequestMapping("/app")
public class Controller {
 
	
	@Autowired
	private EmployeeRepo empRepo;
	
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
	
	
	@PostMapping("/add")
	public String add(@RequestBody  Employee emp) {
//		emp.setPassword(encoder.encode(emp.getPassword()));
		
		
		
		Employee emp1= empRepo.save(emp);
		
		return "Employee is saved in the database";
	}
	
	
	
	
	
	
	
	
	
	
}
