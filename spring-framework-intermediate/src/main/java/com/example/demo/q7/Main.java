package com.example.demo.q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Dummy1 dummy1 = context.getBean(Dummy1.class);
        dummy1.display(3);
    }
}
