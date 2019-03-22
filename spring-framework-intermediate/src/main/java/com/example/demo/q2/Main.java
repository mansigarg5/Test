package com.example.demo.q2;

import com.example.demo.q1.Demo;
import com.example.demo.q3.Database;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        Demo demo = context.getBean(Demo.class);
        demo.display();
        context.close();
    }
}
