package com.rupesh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.rupesh.entity.Student;

@Component("studnetDao")
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
	
	
	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		
		String query="Select * from student where id=?";
		RowMapper<Student> rowMapper=new RopMapperImpl();
	 Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId );
	 
		
		
		return student;
	}
	
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		String query="Select * from  student";
		List<Student> student = this.jdbcTemplate.query(query,new RopMapperImpl());
		
		return student;
	}

	
	
	
	
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate =jdbcTemplate;
	}

	
	

	



	
	
}
