package com.rupesh;

public class Parent {

	private String name;
	private String gender;
	private int age;
	
	
	public Parent() {
		
	}


	public Parent(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Parent [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
