package com.example.demo.controllers;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;


@RestController
@AllArgsConstructor
@RequestMapping("api/v1/students")


public class StudentController {
private StudentService studentService;
private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);
@GetMapping()
public ResponseEntity<Iterable<Student>> getStudents(){
    logger.debug("inside StudentController.getStudents() method");
    return new ResponseEntity<>(studentService.getAllStudents(), OK);
}

@GetMapping("{id}")
public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
    logger.debug("inside StudentController.getStudentById() method "+id);
    Student st = studentService.getStudentById(id);
    return new ResponseEntity<>(st, OK);
}

@PostMapping()
public ResponseEntity<Student> createStudent(@RequestBody Student st){
    logger.debug("inside StudentController.createStudent() method "+st);
    Student savedUser = studentService.createStudent(st);
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}

@PutMapping("{id}")
public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id,@RequestBody Student st){
    logger.debug("inside StudentController.updateStudent() method "+st +" "+ id);
    st.setId(id);
    Student updatedUser = studentService.updateStudent(st);
    return new ResponseEntity<>(updatedUser, OK);
}

@DeleteMapping("{id}")
public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id){
    logger.debug("inside StudentController.deleteStudent() method "+ id);
    studentService.deleteStudent(id);
    return new ResponseEntity<>("Student successfully deleted!", OK);
}
}
