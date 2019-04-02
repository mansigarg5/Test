package com.example.thymeleafDemo.controller;

import com.example.thymeleafDemo.entity.Employee;
import com.example.thymeleafDemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Q8Controller {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/q8")
    public ModelAndView display8(){
        List<Employee> employeeList = employeeService.getEmployees();
        return new ModelAndView("q8").addObject("empList",employeeList);
    }
}
