package com.example.thymeleafDemo.controller;

import com.example.thymeleafDemo.entity.Employee;
import com.example.thymeleafDemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Q4Controller {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/q4")
    public ModelAndView display4(ModelAndView model){
            model.addObject("employee",new Employee());
        return model ;
    }
    @PostMapping("/q4")
    public ModelAndView submit4(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
        List<Employee> employeeList = employeeService.getEmployees();
        return new ModelAndView("submit4").addObject("empList",employeeList);
    }
}


