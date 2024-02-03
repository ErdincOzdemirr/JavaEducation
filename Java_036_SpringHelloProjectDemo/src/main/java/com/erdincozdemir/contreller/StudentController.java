package com.erdincozdemir.contreller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Web sayfaları //eski projelerde görürsün.
@RestController //RESTful // Web projeniz farklı konumdaysa json veri formatında çıktı alınır.
public class StudentController {

     //http://localhost:8090
     //http://127.0.0.1:8090
     @GetMapping
     public String getHello() {
          return "Spring Boot Hello World! This sentence was written by Erdinc! ";
     }

     @DeleteMapping
     public String getHello2() {
          return "Delete Boot Erdinc";
     }
}
