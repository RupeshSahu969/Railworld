package com.rupesh.Dao;
import java.util.List;

import com.rupesh.exception.EmployeeException;
import com.rupesh.model.Employee;
import com.rupesh.util.EMUtil;

import jakarta.persistence.EntityManager;

public class EmployeeDaolmp implements EmployeeDao{

private EntityManager em;
	
	
	public EmployeeDaolmp() {
		// TODO Auto-generated constructor stub
		this.em = EMUtil.getEntityManager();
	}
	
	
	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 em.getTransaction().begin();
          
        Employee emp1 = em.merge(emp);
        
        em.getTransaction().commit();
        
        if(emp1 != null)
        {
        	System.out.println("employee saved in the database");
        }
        else 
        {
        	System.out.println("Not saved in the database");
        }
		return null;
		
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		 Employee emp =   em.find(Employee.class, id);
		   
		   if(emp != null) {
			   return emp;
		   }else {
			   throw new EmployeeException("There is no employee with id : "+ id);
		   }
		
	
	}

	@Override
	public Employee deleteEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
// TODO Auto-generated method stub
// using sql
//	     Query q =	em.createNativeQuery("select * from employee", Employee.class);
 // using jpql 
//		Query q =em.createQuery("From com.rupesh.model.Employee");
//	     
//	       Stream stream =  q.getResultStream();
//	       
//	        List<Employee> employees =  stream.toList();
		
		
		
		
		return null;
	}


	@Override
	public Employee updateEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee updatedEmployee= new Employee();
		
		 Employee emp =   em.find(Employee.class, id);
		   
		   if(emp != null) {
			   updatedEmployee.setEmpName(emp.getEmpName());
			   updatedEmployee.setAge(emp.getAge());
			   updatedEmployee.setGender(emp.getGender());
			  
			   return updatedEmployee;
		   }else {
			   return null;
		   }
	}

	
	
}
