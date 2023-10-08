package com.rupesh;

import java.util.Scanner;

import com.rupesh.dao.EmployeeDao;
import com.rupesh.dao.EmployeeDaoImp;
import com.rupesh.model.Address;
import com.rupesh.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		
		
//		System.out.println("enter the employee details ");
//		String eName= sc.nextLine();
//		
//		
//		System.out.println("ENter the age");
//		int age= sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("Enter the city");
//		String city= sc.nextLine();
//		
//		System.out.println(" Enter the State");
//		String state= sc.nextLine();
//		
//		System.out.println(" Enter the incode");
//		String pincode= sc.nextLine();
//		
//		Employee emp= new Employee();
//		
//		emp.seteName(eName);
//		emp.setAge(age);
//		emp.setAddress(new Address(city,state,pincode));
//		
//		
//		EmployeeDao empDao= new EmployeeDaoImp();
//		
//		String result =empDao.addEmployee(emp);
//		
//		
//		System.out.println(result);
		
		
		System.out.println("Enter the employee Id");
		int id=sc.nextInt();
		
		EmployeeDao empDao= new EmployeeDaoImp();
		empDao.getEmployeeById(id);
		
		
		
		
	}

}
