package com.rupesh;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;
import com.rupesh.nodel.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
		
		
		EntityManager em=emf.createEntityManager();
		
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter the employee name");
//		String name = sc.next();
//		
//		System.out.println("ENter the Age");
//		Integer age= sc.nextInt();
//		
//		
//		System.out.println("Enter the Salary");
//		Double salary= sc.nextDouble();
//		
//		
//		Employee emp= new Employee();
//		
//		emp.setName(name);
//		emp.setAge(age);
//		emp.setSalary(salary);
//		
//		em.getTransaction().begin();
//		em.persist(emp);
//		
//		em.getTransaction().commit();
//		System.out.println("EMployee is Saved");
//		
//		----    Update employee  ---------------------------
		
//		  System.out.println("Enter the employee id");
//		       int empId =      sc.nextInt();
//		       
//	       System.out.println("ENter the name");
//	        String name = sc.next();
//	        
//	        em.getTransaction().begin();
//	          
//	          Employee emp =   em.find(Employee.class, empId);
//	          
//		            if(emp != null ) {
//	            	 emp.setName(name);
//	            	em.getTransaction().commit();
//	            	 System.out.println("Employee saved in the database");
//	            }else {
//	            	 System.out.println("there is no employee with this id:" + empId);
//	            }
		
		
		//    -------   List of All Data --------------
		
		
//		Query q=  em.createNamedQuery("select * from employee",Employee.class);
//		
//		List<Employee> list = q.getResultList();
//		
//		list.forEach(s -> System.out.println(s));
		
		
		
		// ---------------   Delete Items  ----------------
		
		
		 System.out.println("ENter the id of employee to delete that employee");
		      int id  = sc.nextInt();
		      
		 Employee emp = em.find(Employee.class, id);
		 
		 if(emp != null) {
			 em.getTransaction().begin();
			 
			 em.remove(emp);
			 
			 em.getTransaction().commit();
			 
			 System.out.println("Employee is delete form databases");
			 
		 }
		 else 
		 {
			 System.out.println("There is no Employees" +  id);
		 }
		 
		
		
		
		
		
		
	}

}
