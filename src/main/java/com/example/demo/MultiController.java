package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Q2- Now remove AbstractController and useMultiActionController for StudentController
// which contains 2 actions one action renders a jsp view and another action uses HttpServletResponse
// to show the output on the Web browser.
public class MultiController extends MultiActionController {
    public ModelAndView display(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("Display");
        return  mav;
    }
    public void demo(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        response.setContentType("text/html");
        response.getWriter().println("<b>This is demo from multi controller.</b>");
    }
}



