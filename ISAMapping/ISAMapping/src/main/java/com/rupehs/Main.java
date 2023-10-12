package com.rupehs;

import java.util.Scanner;

import com.rupehs.dao.AnimalDao;
import com.rupehs.dao.AnimalDaoImp;
import com.rupehs.model.Cat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
//		System.out.println("ENter thge Animal anme");
//		String aName=sc.nextLine();
//		
//		
//		System.out.println("ENter breed dog");
//		String breed=sc.nextLine();
//		
//		System.out.println("ENter lifespan");
//		Integer life=sc.nextInt();
//		
//		
//		Dog d1= new Dog();
//		d1.setaName(aName);
//		d1.setBreed(breed);
//		d1.setLifespan(life);
//		
//		
//		AnimalDao aDao= new AnimalDaoImp();
//		
//		String result= aDao.addAnimal(d1);
//		
//		System.out.println(result);
		
		System.out.println("ENter thge Animal anme");
		String aName=sc.nextLine();
		
		
		System.out.println("ENter breed color");
		String color=sc.nextLine();
		
		System.out.println("ENter age");
		Integer age=sc.nextInt();
		
		
		 Cat c1 = new Cat();
		 
		 c1.setaName(aName);
		 c1.setAge(age);
		 c1.setColor(color);
			
		
		
		AnimalDao aDao= new AnimalDaoImp();
		
		String result= aDao.addAnimal(c1);
		
		System.out.println(result);
		
	}

}
