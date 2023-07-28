package com.rupesh;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> a1= new ArrayList<Student>();
		
		a1.add(new Student(10,"n1",234));
		a1.add(new Student(20,"n2",24));
		a1.add(new Student(30,"n3",600));
		a1.add(new Student(40,"n4",754));
		a1.add(new Student(50,"n5",844));
		a1.add(new Student(60,"n6",467));
		a1.add(new Student(70,"n7",854));
		a1.add(new Student(80,"n8",655));
		
		
//		int x=a1.stream().collect(Collectors.summingInt(s->s.getMarks()));
//		
		
//		boolean x=a1.stream().anyMatch(s->s.getMarks() > 600) ;

		boolean x=a1.stream().noneMatch(s->s.getMarks() > 600) ;
		
		System.out.println(x);
		
	}
}
