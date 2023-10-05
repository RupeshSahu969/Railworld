package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	
	private String name;
	
	private String email;
	
	private String roles;
	
	
	
	
	private void Eployee() {
		// TODO Auto-generated method stub

	}




	public Employee(Integer empId, String name, String email, String roles) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.roles = roles;
	}




	public Integer getEmpId() {
		return empId;
	}




	public void setEmpId(Integer empId) {
		this.empId = empId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getRoles() {
		return roles;
	}




	public void setRoles(String roles) {
		this.roles = roles;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", roles=" + roles + "]";
	}
	
	
	
	
}
