package com.rupesh;

public interface Animal {
	
	
	
	default void info() {
		
		System.out.println("This is interface");
	}
	
	
	public void etc();
	public void walk();
	public void sleep();
	public void makeNoice();

}
