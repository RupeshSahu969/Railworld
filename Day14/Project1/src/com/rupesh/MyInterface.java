package com.rupesh;

public interface MyInterface {

	public void fun();
	
	public static void info() {
		
	}
	
	default String funA() {
		return "This is good MyInterface";
	}
}
