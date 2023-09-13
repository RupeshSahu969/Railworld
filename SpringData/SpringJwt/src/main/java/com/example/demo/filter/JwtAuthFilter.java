package com.example.demo.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.config.EmployeeUserDetails;
import com.example.demo.config.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtAuthFilter extends OncePerRequestFilter{

	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private EmployeeUserDetails userDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String authHeder=request.getHeader("Authorization"); 
		
		String token =null;
		if(authHeder != null && authHeder.contains("Bearer")) {
			token= authHeder.substring(7);
			
		}
		
		
	}

	
	
	
}
