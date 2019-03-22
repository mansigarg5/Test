package com.example.demo.q8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointcutDemo {
    @Pointcut("execution(void display())")
    void demoPointcut(){}
    @Before("demoPointcut()")
    void beforeAdvice(){
        System.out.println("Advice via Pointcut.");
    }

}
