package com.example.demo.q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Dummy3 dummy3 = context.getBean(Dummy3.class);
        dummy3.display();
    }
}
