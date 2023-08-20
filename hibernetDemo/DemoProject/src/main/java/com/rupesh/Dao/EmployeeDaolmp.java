package com.rupesh.Dao;

import com.rupesh.exception.EmployeeException;
import com.rupesh.modal.Employee;
import com.rupesh.util.EMUtil;

import jakarta.persistence.EntityManager;

public class EmployeeDaolmp implements EmployeeDao{

	private EntityManager em;
	
	public EmployeeDaolmp() {
		this.em=EMUtil.getEntityManager();
	}
	
	
	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Employee emp1 =em.merge(emp);
		
		em.getTransaction().commit();
		
		if(emp1 != null) {
			System.out.println("Employee Saved in the database");
		}
		else {
			System.out.println("Not Saved in the database");
		}
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
