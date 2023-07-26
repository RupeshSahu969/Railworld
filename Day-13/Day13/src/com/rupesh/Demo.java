package com.rupesh;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Map <Student,Parent> map = new HashMap<>();
		
		Student st= new Student(1,"rupesh","male");
		Parent pr= new Parent("ram", "male", 1);
		   
		map.put(st,pr);
		map.put( new Student(1,"rupesh","male"), new Parent("ram", "male", 1));
		
		Set<Student> keys= map.keySet();
		
		for(Student key : keys) {
			System.out.println(key);
		}
		
		Set<Entry<Student,Parent>>  setem= map.entrySet();
		
		for(Entry<Student, Parent> en: setem) {
			
			Student key=en.getKey();
			Parent value =en.getValue();
			System.out.println(key +" "+value);
		}
		
		
	}

}
