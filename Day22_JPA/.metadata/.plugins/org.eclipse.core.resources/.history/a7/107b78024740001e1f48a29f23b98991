package com.rupeshs;

import java.util.Scanner;

import com.rupesh.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EntityManagerFactory emf =     Persistence.createEntityManagerFactory("empUnit");
	      EntityManager    em =      emf.createEntityManager();
	      
	     Employee emp =    new Employee();
	       emp.setEmpName("veena");
	       emp.setAge(23);
	       emp.setGender("Fmale");
	           
	          em.getTransaction().begin();
	          em.getTransaction().commit();
	          System.out.println("done...");
	          em.close();

		
	}

}
