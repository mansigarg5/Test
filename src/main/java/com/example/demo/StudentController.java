package com.example.demo;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Q1- Implement AbstractController in StudentController.
// Create a mapping index.html for it and render index.jsp view from it which displays messages "Hello from index.gsp"
public class StudentController  extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ModelAndView modelAndView = new ModelAndView("Hello");
        return modelAndView;
    }
}
