package com.example;

import com.example.dao.Studentdao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("My Program Started.......!");

        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
      // JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

       // insert query
      //  String query ="insert into student(id,name,city) values(?,?,?) ";

        // fire query
       // int result = template.update(query,25,"shivam","delhi");
       // System.out.println("number of record inserted..."+result);

        Studentdao studentdao = context.getBean("studentdao",Studentdao.class);

        // INSERT
        Student student= new Student();
        student.setId(34);
        student.setName("haider");
        student.setCity("kanpur");

        int result = studentdao.insert(student);
        System.out.println("student added"+result);

        //  UPDATE
//        Student student= new Student();
//        student.setId(88);
//        student.setName("kunal");
//        student.setCity("mumbai");
//        int result = studentdao.change( student);
//        System.out.println("data changed"+ result);

       // DELETE
//        int result = studentdao.delete(333);
//        System.out.println("deleted"+ result);

//        Student student = studentdao.getStudent(22);
//        System.out.println(student);

        List<Student> students = studentdao.getAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}