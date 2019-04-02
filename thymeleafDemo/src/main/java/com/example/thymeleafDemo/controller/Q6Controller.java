package com.example.thymeleafDemo.controller;

import com.example.thymeleafDemo.entity.Employee;
import com.example.thymeleafDemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q6Controller {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/q6")
    public ModelAndView display6(ModelAndView model){
        model.addObject("employee", new Employee());
        return model;
    }

    @PostMapping("/q6")
    @ResponseBody
    public String submit6(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        if(employee.getIsAdmin()){
            return "Hello Admin";
        }
        else
        {
            return "Hello User";
        }
    }
}
