package com.rupesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		
		
		students.add(new Student(10,"nam1",123));
		students.add(new Student(11,"nam2",103));
		students.add(new Student(12,"nam3",193));
		students.add(new Student(13,"nam4",173));
		students.add(new Student(14,"nam5",133));
		students.add(new Student(16,"nam6",153));
		
		Collections.sort(students, (s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1 );
		System.out.println(students);

		
	}
}
