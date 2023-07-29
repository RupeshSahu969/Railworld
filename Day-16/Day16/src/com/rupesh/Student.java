package com.rupesh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch2", "root", "root");
			
			if(con != null) {
				System.out.println("Connection is opend with mysql sever");
			}
			else {
				System.out.println("Connection is not opend");
			}
			
			
			Statement st =con.createStatement();
			
			 int x =   st.executeUpdate("Insert Into student values(5, 'baja', 30)");
	          
	          if(x > 0) {
	        	   System.out.println("Data Inserted sucefully");
	          }else {
	        	  System.out.println("Not insterted");
	          }
	       
	          con.close();
	          
	          if(con.isClosed()) {
	        	    System.out.println("Connection is closed");
	          }
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
