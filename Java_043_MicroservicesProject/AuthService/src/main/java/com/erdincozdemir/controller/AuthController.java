package com.erdincozdemir.controller;

import com.erdincozdemir.constant.EndPoint;
import com.erdincozdemir.model.Auth;
import com.erdincozdemir.dto.request.DoLoginRequestDto;
import com.erdincozdemir.dto.request.DoRegisterRequestDto;
import com.erdincozdemir.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//    http://localhost:9090
@RestController
@RequestMapping
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(EndPoint.REGISTER)
   public ResponseEntity<Auth> doRegister(@RequestBody DoRegisterRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(authService.doRegister(dto));
   }


    @PostMapping(EndPoint.LOGIN)
    public ResponseEntity<Auth> doLogin(@RequestBody DoLoginRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(authService.doLogin(dto));
    }

    public ResponseEntity<  List <Auth>  > findAll()   {
        return ResponseEntity.ok(authService.findAll());
    }


    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("AuthServis mesaji");
    }

}
