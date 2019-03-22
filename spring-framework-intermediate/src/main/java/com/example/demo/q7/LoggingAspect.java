package com.example.demo.q7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(void display(int))")
    void beforeAdvice() {
        System.out.println("Before execution is running");
    }
    @Before("within(com.example.demo.q7.*)")
    void beforeAdvice1(){
        System.out.println("Before within is running.");
    }
    @Before("args(Integer)")
    void beforeAdvice2(){
        System.out.println("Before args is running.");
    }
    @Before("this(Dummy1)")
    void beforeAdvice3(){
        System.out.println("Before this method running.");
    }
    @Before("bean(dummy1)")
    void beforeAdvice4(){
        System.out.println("Before bean method running.");
    }
}
