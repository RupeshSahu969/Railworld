package com.rupesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the age");
		int age= sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try 
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2", "root", "root" );
			if(con != null) {
				Statement st= con.createStatement();
				int x=st.executeUpdate("Insert into student values(" +id + ", '" +name +"', "+ age+")");
				
				if(x > 0) {
					System.out.println("Student add successfully");
					
				}else {
					System.out.println("Data is not added");
				}
			}
			else {
				System.out.println("Not connect with the database");
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
