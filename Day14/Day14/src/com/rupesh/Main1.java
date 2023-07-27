package com.rupesh;

interface Intr{
//	void  syaHello(String name);
	void  add(int num1, int num2);
}



public class Main1 {

	public static void main(String[] args) {
		
//		Intr i1= (String name) -> {
//			System.out.println(name);
//		};
//		i1.syaHello("Rahja");
		

		Intr i1=(n1,n2)->{
			System.out.println("Welcon to raipur" + (n1+n2));
		};
		i1.add(10,20);
	}
	
	
}
