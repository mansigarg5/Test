package com.example.demo.q9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPointDemo {
    @Before("execution(void displayDemo())")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs());

    }
}
