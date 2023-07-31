package com.rupesh.dao;

import java.sql.SQLException;
import java.util.List;

import com.rupesh.exception.EmployeeException;
import com.rupesh.model.Employee;

public interface EmployeeDao {
	
	public String addEmployee(Employee emp) throws SQLException;
	
	public Employee getEmpById(int id) throws SQLException,EmployeeException;


	public List<Employee> getAllEmp() throws SQLException, EmployeeException;
}
