package com.erdincozdemir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    //http://localhost:9090
    @GetMapping("/")
    public String hello(){
        return "Service A Hello";
    }

    //http://localhost:9090
    @GetMapping("/info")
    public String info(){
        return "INFO: Service A";
    }
}
