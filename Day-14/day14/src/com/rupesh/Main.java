package com.rupesh;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(1,"rupesh","male"));
		students.add(new Student(2,"shubam","male"));
		students.add(new Student(1,"khushi","fmale"));
		students.add(new Student(1,"ram","male"));
		students.add(new Student(1,"veena","Fmale"));
		
		
		students.forEach(System.out::println);
		
	}
}
