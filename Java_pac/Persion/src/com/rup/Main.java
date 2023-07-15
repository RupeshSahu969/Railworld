package com.rup;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name");
		String name = sc.next();
		System.out.println("Enter a age");
		int age=sc.nextInt();
		System.out.println("Enter a gender");
		String gender=sc.next();
		
		System.out.println("Enter a id");
		int id=sc.nextInt();
		
		System.out.println("Enter a color");
		String color=sc.next();
		
		Persion d1= new Persion();
		
		System.out.println(d1);
	}

}
