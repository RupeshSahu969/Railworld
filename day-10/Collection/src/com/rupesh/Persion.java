package com.rupesh;

public class Persion {

	public String name;
	public int age;
	public int sal;
	public String gender;
	
	public Persion() {
		
	}

	public Persion(String name, int age, int sal, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.gender = gender;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}

	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", age=" + age + ", sal=" + sal + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
