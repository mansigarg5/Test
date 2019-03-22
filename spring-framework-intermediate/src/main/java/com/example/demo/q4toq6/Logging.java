package com.example.demo.q4toq6;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Aspect
public class Logging {
    //Q4- Create a logging aspect. Create a pointcut to log all methods Of services .
    @Pointcut("execution(void *())")
    void voidPointcut(){}
    //Q5- Add a logging statement before and after the method ends
    @Before("voidPointcut()")
    void beforeAdvice() {
        System.out.println("Before service is running");
    }
    @After("voidPointcut()")
    void afterAdvice(){
        System.out.println("After service is running");
    }
    //Q6- Log all the methods which throw IOException
    @AfterThrowing(pointcut = "voidPointcut()", throwing = "ex")
    void throwException(IOException ex) throws IOException{
        System.out.println("Running AfterThrowing " + ex);
    }
}
