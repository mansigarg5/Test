package com.example.demo.q9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Dummy4 dummy4 = context.getBean(Dummy4.class);
        dummy4.displayDemo();
    }
}
