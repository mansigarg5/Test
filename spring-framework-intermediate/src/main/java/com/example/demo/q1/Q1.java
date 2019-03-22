package com.example.demo.q1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        Demo demo = context.getBean(Demo.class);
        demo.display();
        context.stop();
        context.close();

    }
}
