package com.Configurationsecurity.security.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class WelcomeController {
    @GetMapping
    public ResponseEntity<String >welcome()
    {
       return new ResponseEntity<>("Welcome the spring security ", HttpStatus.OK);
    }
}
