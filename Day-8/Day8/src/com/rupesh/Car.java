package com.rupesh;

public interface Car {

	
	default void info() {
		System.out.println("This is car");
	}
	
	
	public static void saticInfo() {
		System.out.println("This is static method");
	}
}
