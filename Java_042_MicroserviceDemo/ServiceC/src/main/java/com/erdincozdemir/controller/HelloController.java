package com.erdincozdemir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:9092
@RestController
@RequestMapping
public class HelloController {

    //http://localhost:9092
    @GetMapping("/")
    public String hello(){
        return "Service C Hello";
    }

    //http://localhost:9092
    @GetMapping("/info")
    public String info(){
        return "INFO: Service C";
    }
}
