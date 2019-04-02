package com.example.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class Q7Controller {

    @GetMapping("/q7")
    public String display7(){
        return "q7";
    }

    @GetMapping("/time")
    @ResponseBody
    public String getTime(){
        return new Date().toLocaleString();
    }
}
