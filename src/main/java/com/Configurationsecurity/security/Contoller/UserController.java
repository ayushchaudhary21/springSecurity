package com.Configurationsecurity.security.Contoller;

import com.Configurationsecurity.security.Entity.UserEntity;
import com.Configurationsecurity.security.Repository.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class UserController {
    private final UserRepo userRepo;

     public UserController(UserRepo userRepo)
     {
         this.userRepo=userRepo;
     }

    @PostMapping("/register")
    public UserEntity createUser(@RequestBody UserEntity user)
    {
          return userRepo.save(user);
    }

}
