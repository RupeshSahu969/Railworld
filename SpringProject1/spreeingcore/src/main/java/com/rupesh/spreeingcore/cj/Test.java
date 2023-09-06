package com.rupesh.spreeingcore.cj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/rupesh/spreeingcore/cj/ciconfig.xml");
		
		Persion p=(Persion) context.getBean("persion");
		
		System.out.println(p);
		
	}

}
