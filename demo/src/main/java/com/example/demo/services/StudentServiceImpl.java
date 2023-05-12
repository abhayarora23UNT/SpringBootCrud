package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> optionalUser = studentRepository.findById(id);
        return optionalUser.get();
    }

    @Override
    public Student createStudent(Student st) {
        return studentRepository.save((st));
    }

    @Override
    public Student updateStudent(Student st) {
        return studentRepository.save((st));
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
