package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;



@Component
public class EmployeeDetailService implements UserDetailsService {

	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Employee emp=empRepo.findByName(username).orElseThrow(() -> new UsernameNotFoundException("This " + username +" is  not found "));
		return new EmployeeUserDetails(emp);
	}

}
