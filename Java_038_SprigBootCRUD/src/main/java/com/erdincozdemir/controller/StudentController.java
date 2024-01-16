package com.erdincozdemir.controller;

import com.erdincozdemir.model.Student;
import com.erdincozdemir.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// http://localhost:8082/api/v1/
@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    StudentService studentService;

    // http://localhost:8082/api/v1/hello
    @GetMapping(path = "/hello")
    public String hello() {
        return "Selam";
    }



    //GET -SELECT * FROM
    // http://localhost:8082/api/v1/students
    @GetMapping(path = "/students")
    public List<Student> getStudents() {
        return studentService.getAllStudent();
        //return "Birden fazla ogrenciyigetir.";
    }

    //GET -SELECT * FROM WHERE (1 ÖĞRENCİYİ ALDIĞIMIZ İÇİN ŞART VAR)
    // http://localhost:8082/api/v1/student/1/sene/2024
    @GetMapping(path = "/student/{id}")
    public Student getStudent(
            @PathVariable (value = "id") Long id
    ) {
        return studentService.getoneStudent(id);
    }

    //POST - ADD / INSERT / CREATE
    // http://localhost:8082/api/v1/students
    @PostMapping(path = "/student")
    public String addStudent(Student student) {
        // student kaydedilecek
        return "Ekleme Başarılı";
    }

    //PUT - UPDATE
    // http://localhost:8082/api/v1/students
    @PutMapping(path = "/student")
    public String updateStudent() {
        return "Bir öğrenciyi güncelle Erdinç";
    }

    //Delete
    // http://localhost:8082/api/v1/student
    @DeleteMapping(path = "/student/{id}")
    public String deleteStudent(@PathVariable (name = "id") Long id) {
        return "Sadece 1 öğrenciyi sil.";

        //elinizde id değeri var.
    }


}
