package com.rupesh;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		
//		MyInterface my= new MyInterface() {
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		my.fun() ;
			
		
		
//		MyInterface my1=()->{
//			System.out.println("This is using goos boy");
//		};
//		my1.fun();
		
		
		
//		MyInterface1  inter = (int i)  -> {
//		    return "This is using lambda experssion, parameter and return type " + i;
//	  };
//		
//		String str= inter.abstractMethod(10);
//		System.out.println(str);
		
		
//		MyInterface myInter1= new Demo():: method1;
//		
//		myInter1.fun();
//		
//		
//			MyInterface myInter2=  Demo:: new;
//		
//			myInter2.fun();
		
		
		Predicate<Student> p1 = i -> (i.getMarks() > 500) ? true : false;
		
	boolean b1=p1.test(new Student(1,"sumit" , 600));
	
	System.out.println(b1);
	
	
	List<Student> students = new ArrayList<>();	
	students.add(new Student(1,"sumit" , 500));
	students.add(new Student(2,"asdas" , 800));
	students.add(new Student(3,"dasdt" , 300));
	students.add(new Student(4,"fdft" , 900));
	students.add(new Student(5,"sumitdsfds" , 600));
	
//	Stream<Student> stream=students.stream();
//	
//	Stream<Student> stream1=stream.filter(p1);
//	
//	List<Student> students1=stream1.toList();
//	
//	for(Student s :students1) {
//		System.out.println(s);
//	}
	
	
	List<Student> students1=students.stream()
	.filter(s -> (s.getMarks() > 500 ? true: false ))
	.toList();
	
	
	
	};
		
		
	}
	
	
	

