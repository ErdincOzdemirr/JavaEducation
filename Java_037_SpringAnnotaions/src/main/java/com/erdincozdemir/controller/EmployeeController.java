package com.erdincozdemir.controller;

import com.erdincozdemir.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Objects;

@Controller
public class EmployeeController {


    // http://localhost:8090
    // http://localhost:8090/
    // http://localhost:8090/anasayfa
    // http://localhost:8090/hello

    @GetMapping({"/", "/anasayfa", ""})
    public String viewIndex(Map<String, Object> model){

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Banu");
        employee.setLastName("Sadiye");
        employee.setEmail("abc@asdadsa.com");
        model.put("employee", employee);
        return "index.jsp";
    }
}
