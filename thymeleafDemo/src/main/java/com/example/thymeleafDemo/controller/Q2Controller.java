package com.example.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class Q2Controller {
    @GetMapping("/q2")
    public String display2(){
        return "q2";
    }
}
