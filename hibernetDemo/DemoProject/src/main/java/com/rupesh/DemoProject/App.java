package com.rupesh.DemoProject;

import com.rupesh.modal.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
    	
    	EntityManager em= emf.createEntityManager();
    	
    	 Employee emp =    new Employee();
	       emp.setEmpName("sumit");
	       emp.setAge(33);
	       emp.setGender("male");
    	
	       em.getTransaction().begin();
	       
	       em.getTransaction().commit();
	       System.out.println("done...");
	       em.close();
    	
    }
}
