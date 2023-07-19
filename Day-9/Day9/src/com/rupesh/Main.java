package com.rupesh;
import java.util.*;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a account number");
		int accountnumber = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter a account name");
		String name=sc.nextLine();
		
		System.out.println("Enter a gender");
		String gender=sc.next();
		
		System.out.println("Enter a accounttype");
		String accountType=sc.next();
		
		
		Account d1= new Account();
		
		d1.setAccountname(name);
		d1.setAccountnumber(accountnumber);
		d1.setAccountType(Enum.valueOf(AccountType.class, accountType));
		d1.setGender(Enum.valueOf(Gender.class, gender));
		
		
		System.out.println(d1);
		
	}
}
