package com.rupesh;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persion> persion = new ArrayList<Persion>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			System.out.println("ENter the name");
			String name=sc.next();
			System.out.println("ENter the age");
			int age=sc.nextInt();
			System.out.println("ENter the sal");
			int sal=sc.nextInt();
			System.out.println("ENter the gender");
			String gender=sc.next();
			
			persion.add(new Persion(name,age,sal,gender));
			
		}
		
		for(Persion s: persion) {
			System.out.println(s);
		}
		
		
	}

}
