package com.erdincozdemir.contreller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //RESTful
public class StudentController {

     //http://localhost:8082
     @GetMapping
     public String getHello() {
          return "Spring Boot Hello World! This sentence is writing Erdinç! ";
     }

}
