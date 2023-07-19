package com.rupesh;


public class Main {

	public static void varMethod(int b ,String...strs  ) {
		
		System.out.println(b);
		for(String str : strs) {
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args) {
		
		varMethod(1,"rupesh");
	}
	
	
}
