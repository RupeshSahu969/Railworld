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
	       emp.setEmpName("sumit");
	       emp.setAge(33);
	       emp.setGender("male");
	      
//	      
//	      // by unique id
	          Scanner sc = new Scanner(System.in);
//	      
//	      
//	        System.out.println("Enter the emp Id");
//	        Integer id =  sc.nextInt();
//	        
//	        
//	       em.getTransaction().begin();
//	       
//	        Employee emp2 =   em.find(Employee.class, id);
//	        
//	        
//	          em.remove(emp2);
//	         
//	       em.getTransaction().commit();
//	       
//	       if(emp2 != null) {
//	    	    System.out.println(emp2);
//	       }else {
//	    	    System.out.println("There is no ewmployee with this id" + id);
//	       }
	         
	      
	        // EmployeeDao;
	      
//	           EmployeeDao empDao = new EmployeeDaolmp();
//	           
//	         List<Employee>  emps =     empDao.getAllEmployee();
//	         
//	         emps.forEach(System.out::println);
		
		
	}

}
