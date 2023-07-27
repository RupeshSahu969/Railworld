package com.rupesh;

import java.util.Date;

public class Persion {

	public int emid;
	public String name;
	public String gender;
	public Date date;
	
	
	public Persion(int emid, String name, String gender, Date date) {
		super();
		this.emid = emid;
		this.name = name;
		this.gender = gender;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Persion [emid=" + emid + ", name=" + name + ", gender=" + gender + ", date=" + date + "]";
	}
	
	
	
	
}
