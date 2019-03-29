package com.example.controller;

import com.example.entity.Student;
import com.example.event.Bootstrap;
import com.example.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    Bootstrap bootstrap;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/")
    public String display(){
        return "Hello demo.........";
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        bootstrap.init();
        logger.info("Info logger");
        logger.warn("Warn logger");
        return studentService.getStudents();
    }
}
