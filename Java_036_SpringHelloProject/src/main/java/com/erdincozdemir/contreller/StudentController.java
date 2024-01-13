package com.erdincozdemir.contreller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Web sayfaları //eski projelerde görürsün.
@RestController //RESTful // Web projeniz farklı konumdaysa json veri formatında çıktı alınır. 
public class StudentController {

     //http://localhost:8082
     @GetMapping
     public String getHello() {
          return "Spring Boot Hello World! This sentence was written by Erdinc! ";
     }

}
