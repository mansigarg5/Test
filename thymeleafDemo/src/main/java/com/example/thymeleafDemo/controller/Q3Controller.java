package com.example.thymeleafDemo.controller;

import com.example.thymeleafDemo.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Q3Controller {
    @GetMapping("/q3")
    public String display3(Model model){
        model.addAttribute("employee",new Employee());
        return "q3";
    }
    @PostMapping("/q3")
    public String submitValue(@ModelAttribute Employee employee){
        return "submit";
    }
}


