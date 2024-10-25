package com.SCode.studentsystem.service;

import com.SCode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
   public Student saveStudent(Student student);
   public List<Student> getAllStudents();
}
