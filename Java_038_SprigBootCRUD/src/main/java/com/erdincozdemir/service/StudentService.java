package com.erdincozdemir.service;

import com.erdincozdemir.model.Student;
import com.erdincozdemir.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getoneStudent(Long id){
        return studentRepository.findById(id).get();
    }


}
