package com.inputProject;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a input");
		String name = sc.next();
		System.out.println("Enter a input");
		
		int age=sc.nextInt();
		System.out.println("Enter a input");
		
		String gender=sc.next();
		
		Student d1= new Student();
		d1.setName(name);
		d1.setGender(gender);
		d1.setAge(age);
		
		System.out.println(d1);
		
		
		
	}
}
