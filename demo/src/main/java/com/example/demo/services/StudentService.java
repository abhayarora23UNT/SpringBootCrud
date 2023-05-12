package com.example.demo.services;

import com.example.demo.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student st);

    Student updateStudent(Student st);

    void deleteStudent(Long id);


}
