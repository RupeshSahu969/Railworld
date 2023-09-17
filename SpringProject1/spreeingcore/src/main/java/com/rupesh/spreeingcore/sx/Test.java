package com.rupesh.spreeingcore.sx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rupesh.sterotype.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/rupesh/spreeingcore/sx/sconfig.xml");

	        Student student = context.getBean("student", Student.class);
		
	}

}
