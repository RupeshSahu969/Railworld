package com.rupesh;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.nextLine();
		
		System.out.println("Enter gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter empId");
		int emid=sc.nextInt();
		
		
		System.out.println("the yyyy-MM-dd of");
		String date=sc.nextLine();
		
		
		LocalDate lDate=	LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		Persion p= new Persion();
		
	}

}
