package com.rupesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//interface intr{
//	void add(int a, int b);
//}


public class Main {


	public static void main(String[] args) {
		
	
//		Intr i1 = (n1,n2) -> {
//			System.out.println("The Result is " +(n1+n2));
//			};
//		
//		i1.add(10,20);
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"name1",780));
		students.add(new Student(12,"name2",480));
		students.add(new Student(14,"name3",680));
		students.add(new Student(15,"name4",580));
		
		Collections.sort(students, (s1,s2) -> s1.getMarks() > s2.getMarks()  ? +1 : -1 );
		System.out.println(students);
		
	}
}
