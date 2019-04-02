package com.example.thymeleafDemo.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class HelloController {
    @GetMapping("/")
    public String display(){
        return "hello";
    }
}
