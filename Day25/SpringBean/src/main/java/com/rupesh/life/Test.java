package com.rupesh.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/rupesh/life/config.xml");
		
			Samosa s1=(Samosa) context.getBean("s1");
		
				
		System.out.println(s1);
		
		
		
	}

}
