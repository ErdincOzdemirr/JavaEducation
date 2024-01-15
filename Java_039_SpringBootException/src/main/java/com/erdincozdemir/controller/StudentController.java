package com.erdincozdemir.controller;

import com.erdincozdemir.model.Student;
import com.erdincozdemir.repository.StudentRepository;
import com.erdincozdemir.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

     /*
    getAllStudent
    getOneStudent
    createStudent
    deleteOneStudent
    updateOneStudent
     */

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    };

}
