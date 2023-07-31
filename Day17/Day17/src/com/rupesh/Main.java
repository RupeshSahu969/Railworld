package com.rupesh;

import java.sql.SQLException;
import java.util.Scanner;

import com.rupesh.dao.EmployeeDao;
import com.rupesh.dao.EployeeDaolmp;
import com.rupesh.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENter the name");
		String eName=sc.nextLine();
		
		
		System.out.println("ENter the age");
		int age=sc.nextInt();
		
		System.out.println("ENter the salary");
		int salary=sc.nextInt();
		
		Employee  emp= new Employee();
		
		emp.seteName(eName);
		emp.seteAge(age);
		emp.seteSalary(salary);
		
		EmployeeDao empDao= new EployeeDaolmp();
		
		try {
			String result=empDao.addEmployee(emp);
			System.out.println(result);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
