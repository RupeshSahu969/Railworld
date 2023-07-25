package com.rupesh;

import java.sql.Date;

public class Employee {

	private int id;
	private String name;
	private String gender;
	private Date date;
	
	
	public Employee() {
		
	}


	public Employee(int id, String name, String gender, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", date=" + date + "]";
	}
	
	
	
	
}
