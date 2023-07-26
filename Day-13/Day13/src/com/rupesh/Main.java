package com.rupesh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		String Persion[] = new String[5];
		
		
		for(int i=0; i<Persion.length; i++) {
			
			System.out.println("Enter the name of Employee");
			Persion[i]=sc.next();
			
		}
		
		
	for(int i=0; i<Persion.length; i++) {
			
			System.out.println(Persion[i]);
			
			
		}
	Arrays.sort(Persion);
	
	for(String s:Persion) {
		System.out.println(s);
	}
		
		
		
	}

}
