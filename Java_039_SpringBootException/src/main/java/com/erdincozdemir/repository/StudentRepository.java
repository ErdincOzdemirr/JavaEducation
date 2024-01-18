package com.erdincozdemir.repository;


import com.erdincozdemir.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
    List<Student> getAllStudent() ;

}
