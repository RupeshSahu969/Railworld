package com.rupesh.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("com/rupesh/sterotype/sconfig.xml");

	        Student student = context.getBean("student", Student.class);

	        System.out.println(student);
	
	}

}
