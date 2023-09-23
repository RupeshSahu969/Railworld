package com.rupesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rupesh.dao.StudentDao;
import com.rupesh.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Rupesh!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/rupesh/config.xml");
        
        StudentDao  studentDao   =context.getBean("studentDao",StudentDao.class);
//        Student student= new Student();
//        student.setId(7);
//        student.setName("Veena nagwanshi");
//        student.setCity("baload");
//        
//        int result=studentDao.insert(student);
//        System.out.println(result);
        
//       update
        
//      Student student= new Student();
//      
//      student.setName("Veena rupesh");
//      student.setCity("dhamtari");
//      student.setId(1);
//      
//      int result=studentDao.change(student);
//      System.out.println(result);
        
        
//        DELETE
        
        Student student= new Student();
        
        
        int result=studentDao.delete(7);
        System.out.println(result);
        
        
        
        
    }
}
