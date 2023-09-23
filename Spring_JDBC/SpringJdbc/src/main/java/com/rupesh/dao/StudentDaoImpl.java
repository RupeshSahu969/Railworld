package com.rupesh.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rupesh.entity.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
	
		 String query="insert into student(id,name,city) values(?,?,?) ";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		
		return r;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query="UPDATE student SET name = ?, city = ? WHERE id = ?";
		int k = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return k;
	}
	
	
	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query="Delete from  student where id=?";
		int d = this.jdbcTemplate.update(query,studentId);
		return d;
	}
	
	
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate =jdbcTemplate;
	}

	



	
	
}
