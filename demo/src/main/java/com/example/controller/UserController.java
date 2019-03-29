package com.example.controller;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    User user;
    @GetMapping("/user")
    public String getUser(){
        return "Username: "+user.getUsername()+", Password: "+user.getPassword();
    }

}