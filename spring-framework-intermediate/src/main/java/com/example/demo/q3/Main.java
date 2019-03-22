package com.example.demo.q3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.start();
        CustomEventPublisher publisher = context.getBean(CustomEventPublisher.class);
        publisher.display();
    }

}
