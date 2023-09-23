package com.rupesh.dao;

import com.rupesh.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);
	
	
	public int delete(int studentId);
	
	
}
