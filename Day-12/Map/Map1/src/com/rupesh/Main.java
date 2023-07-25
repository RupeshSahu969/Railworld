package com.rupesh;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
//		HashMap<Integer,String> hm= new HashMap<>();
//		
//		System.out.println(hm);
//		
//		hm.put(1, "one");
//		hm.put(2, "Two");
//		hm.put(3, "Three");
//		
//		System.out.println(hm.size());
//		
//		Collection<String> values=hm.values();
//		
//		for(String x : values) {
//			System.out.println(x);
//		}
//		
//		Set<Map.Entry<Integer, String>> keyValue=hm.entrySet();
//		
//		for(Map.Entry<Integer,String> me :keyValue) {
//			System.out.println(me.getKey()+"======"+me.getValue());
//		}
		
		
		
//		HashMap<String,Student> hm = new HashMap<>();
//		
//		hm.put("Maharastra",new Student(10,"Ganesh",950));
//		hm.put("Tamilnadu",new Student(12,"Surya",850));
//		hm.put("Telangana",new Student(15,"Venkat",920));
//		hm.put("Haryana",new Student(16,"Dinesh",910));
//		hm.put("Kerla",new Student(18,"Srinu",880));
//		//getting all the state name:
//		Set<String> states= hm.keySet();
//		for(String state:states){
//		System.out.println(state);
		
		
//		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
//		hm.put(105,"Amit");
//		hm.put(105,"Vijay");
//		hm.put(102,"Rahul");
//		for(Map.Entry<Integer,String> me:hm.entrySet()){
//		System.out.println(me.getKey()+" "+me.getValue());
//		}
		

		TreeMap<Student,String> tm = new TreeMap<>(new StudentMarksComp());
		tm.put(new Student(10,"Ganesh",950),"Maharastra");
		tm.put(new Student(12,"Surya",850),"Tamilnadu");
		tm.put(new Student(15,"Venkat",920),"Telangana");
		tm.put(new Student(16,"Dinesh",910),"Haryana");
		tm.put(new Student(18,"Srinu",880),"Kerla");

		Set<Map.Entry<Student,String>> set= tm.entrySet();

		for(Map.Entry<Student,String> me: set) {
			Student student = me.getKey();
			System.out.println("Roll :" + student.getRoll());
			System.out.println("Name :" + student.getName());
			System.out.println("Marks :" + student.getMark());
		}
		}
		
	
}
