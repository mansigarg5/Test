package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant teaRestaurant = applicationContext.getBean(Restaurant.class);
        teaRestaurant.getHotDrink().prepareDrink();

//        Restaurant expressTeaRestaurant = applicationContext.getBean("expressTeaRestaurant", Restaurant.class);
//        expressTeaRestaurant.getHotDrink().prepareDrink();
    }
}







