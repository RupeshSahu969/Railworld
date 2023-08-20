package com.rupesh.Dao;

import com.rupesh.exception.EmployeeException;
import com.rupesh.modal.Employee;

public interface EmployeeDao {

	public String addEmployee(Employee emp);
	
	public Employee getEmployeeById(int id) throws EmployeeException ;
	
	
	
}
