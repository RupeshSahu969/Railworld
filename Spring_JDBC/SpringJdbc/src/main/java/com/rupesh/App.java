package com.rupesh;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
//        ApplicationContext context= new ClassPathXmlApplicationContext("com/rupesh/config.xml");
        
        
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao  studentDao   =context.getBean("studentDao",StudentDao.class);
        Student student= new Student();
        student.setId(13);
        student.setName("havi mishra");
        student.setCity("baload");
        
        int result=studentDao.insert(student);
        System.out.println(result);
        
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
        
//        Student student= new Student();
//        
//        
//        int result=studentDao.delete(1);
//        System.out.println(result);
        
//        Student student=studentDao.getStudent(6);
//        
//        System.out.println(student);
        
        List<Student> student1= studentDao.getAllStudents();
        
        for(Student s: student1) {
        	System.out.println(s);
        }
        
        
    }
}
