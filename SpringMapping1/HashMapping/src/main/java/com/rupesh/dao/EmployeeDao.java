package com.rupesh.dao;

import com.rupesh.model.Employee;

public interface EmployeeDao {

	public String addEmployee(Employee emp);
	
	
	public Employee getEmployeeById(int id);
	
	
	
}
