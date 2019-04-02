package com.example.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class Q1Controller {
    @GetMapping("/q1")
    public String display1(){
        return "q1";
    }
}


