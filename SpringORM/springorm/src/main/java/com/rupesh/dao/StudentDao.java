package com.rupesh.dao;

public class StudentDao {

private HibernateTemplate hibernateTemplate;
	
	public int insert(Student student)
	{
	  Integer i=(Integer)((Object) this.hibernateTemplate).save(student);
		
		return i;
		
	}
}
