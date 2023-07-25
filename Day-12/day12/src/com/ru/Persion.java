package com.ru;

import java.sql.Date;

public class Persion {
	
	public String name;
	
	public Date date;
	
	public String gender;
	
	
	public Persion() {
		
	}
	
	
	public Persion(String name, com.ru.Date date, String gender) {
		super();
		this.name = name;
		this.date = date;
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Persion [name=" + name + ", date=" + date + ", gender=" + gender + "]";
	}

	
}
