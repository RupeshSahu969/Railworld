package com.rupesh.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	 public Integer empId;
    
	  public String empName;
	  
	  public Integer age;
	  
	  public String gender;
	  
	  public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, Integer age, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", gender=" + gender + "]";
	}
	  
	  
	  
}
