package com.rupesh;

import java.util.Objects;

public class Employee {

	public int id;
	public String name;
	public int age;
	public String gender;
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	String info() {
		return "Name is : " + this.name + "this is age : "+this.age+ "this is id : "+this .id +"this is gender: "+this.gender;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
	
	
}
