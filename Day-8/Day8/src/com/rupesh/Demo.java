package com.rupesh;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter the name");
		int age =sc.nextInt();
		
		Student d1=new Student();
		
		
		
		d1.setName(name);
		d1.setGender(gender);
		d1.setAge(age);
		
		System.out.println(d1);
	}
}
