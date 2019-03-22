package com.example.demo.q4toq6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Dummy dummy = context.getBean(Dummy.class);
        dummy.display1();
        dummy.display2();
        dummy.display3();
    }
}
