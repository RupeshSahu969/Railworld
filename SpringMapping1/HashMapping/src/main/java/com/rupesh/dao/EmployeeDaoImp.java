package com.rupesh.dao;

import javax.persistence.EntityManager;

import com.rupesh.model.Employee;
import com.rupesh.utility.EMUtil;

public class EmployeeDaoImp implements EmployeeDao{

	
	private EntityManager em;
	
	public EmployeeDaoImp() {
		this.em = EMUtil.getEntityManager();
	}

	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		this.em.getTransaction().begin();
		
		Employee emp1 =this.em.merge(emp);
		
		this.em.getTransaction().commit();
		
		
		if(emp1 != null) {
			return "Employee is saved";
		}
		
		
		return "Employee is not saved" + emp;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		
	Employee emp=	this.em.find(Employee.class, id);
		
		System.out.println(emp);
		
		return emp;
	}
	


	
	
}
