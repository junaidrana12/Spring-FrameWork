package com.example.dao;

import com.example.Student;

import java.util.List;

public interface Studentdao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(int stuentId);
    public  Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
