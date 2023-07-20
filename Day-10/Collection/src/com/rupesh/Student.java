package com.rupesh;

public class Student {

	private int roll;
	private int age;
	private String name;
	private String gender;
	private int marks;
	
	
	
	public Student() {
		
	}



	public Student(int roll, int age, String name, String gender, int marks) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
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



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + ", gender=" + gender + ", marks=" + marks
				+ "]";
	}
	
	
	
	
}
