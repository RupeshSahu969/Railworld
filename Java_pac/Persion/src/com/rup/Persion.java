package com.rup;

public class Persion {

	public int age;
	public String name;
	public String gender;
	public String color;
	public int id;
	
	
	public Persion() {
		
	}


	public Persion(int age, String name, String gender, String color, int id) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Persion [age=" + age + ", name=" + name + ", gender=" + gender + ", color=" + color + ", id=" + id
				+ "]";
	}
	
	
	
	
	
}
