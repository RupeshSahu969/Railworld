package com.rupehs.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Animal{

	
	
	
	private String color;
	
	private Integer age;
	
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Cat [color=" + color + ", age=" + age + "]";
	}


	
	
	
	
	
	
}
