package com.example.thymeleafDemo.controller;

import com.example.thymeleafDemo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Q10Controller {
    @GetMapping("/q10")
    public String showLoader() {
        return "q10";
    }

    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String register(@ModelAttribute Employee employee) {
        try {
            Thread.sleep(1000); }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "UserName: " + employee.getUsername() + "<br/>Password:" + employee.getPassword() + "<br/>"; }
}
