package com.rupesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

import com.rupesh.exception.EmployeeException;
import com.rupesh.model.Employee;
import com.rupesh.utility.JDBConnection;

public class EployeeDaolmp implements EmployeeDao {

	private Connection con;
	
	public EployeeDaolmp() {
		this.con=JDBConnection.getConnetion();
	}
	
	
	public String addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement  ps =  con.prepareStatement("INSERT INTO employee(eName, eAge, eSalary) Values('"+emp.geteName()+"', "+emp.geteAge()+", "+emp.geteSalary()+")");
		
		int x=ps.executeUpdate();
		if(x > 0) {
			return "Data is saved";
		}
		
		
		return "Data is not  save";
	}

	public Employee getEmpById(int id) throws SQLException, EmployeeException {
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement("Select * from employee e where e.eId = ? ");
		
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			
			return new Employee(rs.getInt("eId"),rs.getString("eName"),
					rs.getInt("eAge"),rs.getInt("eSalary")
					);
		}
		else {
			throw new EmployeeException("There is no employee with this id: " + id);
			
		}
		
	}

	public List<Employee> getAllEmp() throws SQLException, EmployeeException {
		// TODO Auto-generated method stub
		
		List<Employee> emps = new ArrayList<>();
		PreparedStatement ps=con.prepareStatement("SELECT * FROM employee");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt("eId"),
					rs.getString("eName"),
					rs.getInt("eAge"),
					rs.getInt("eSalary")
					);
			emps.add(emp);
		}
		
		if (emps.size() != 0) {
			return emps;
		} else {
			throw new EmployeeException("there is no entry in the database");
		}
		
		
		
	}

	
	
}
