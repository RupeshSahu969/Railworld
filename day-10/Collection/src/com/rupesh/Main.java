package com.rupesh;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		ArrayList ar= new ArrayList();
//		
//		ar.add("a");
//		ar.add("a");
//		ar.add("a");
//		ar.add("a");
//		ar.add(1,"d");
//		
//		Object obj =ar.get(1);
//		for(Object ob :ar) {
//			System.out.println(ob);
//		}
//		
//		
//		Object ob2=ar.remove(2);
//		System.out.println(ob2);
//		
//		
//		List<String> str= new ArrayList<String>();
//		
//		str.add("RUpesh");
//		str.add("Shubam");
//		str.add("Ram");
//		str.add("Abhilasha");
//		str.add("khushi");
//		str.add("Shubam sahu");
		
		
		
		ArrayList<Student> students=new ArrayList<Student>();
		
		Student st= new Student(1,34,"rupesh","male",23);
//		students.add(st);
		
		students.add(new Student(1,34,"rupesh","male",23));
		students.add(new Student(2,26,"ram","male",23));
		students.add(new Student(3,23,"shubam","fmale",23));
		students.add(new Student(4,14,"kaka","male",90));
		students.add(new Student(5,94,"tiwari","fmale",89));
		
		
		System.out.println(students.get(0));
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		
		   
	}

}
