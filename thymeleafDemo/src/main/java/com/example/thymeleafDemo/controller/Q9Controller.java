package com.example.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q9Controller {

    @GetMapping("/q9")
    public ModelAndView display9(){
        return new ModelAndView("q9");
    }
}
