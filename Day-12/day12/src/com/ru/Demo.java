package com.ru;

import java.time.LocalDate;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  nums[]= new int[5];
		
		Persion[] persons= new Persion[5];
		
		
	
	for(int i=0; i<persons.length; i++) {
		persons[1]= new Persion("Rupesh","male",Date.valueOf(LocalDate.parse("2020-02-15")));
	}
		for(Persion p : persons) {
			System.out.println(p);
		}
	}

}
