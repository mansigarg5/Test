package com.spring.demo.q5toq12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Q5 q5 = context.getBean(Q5.class);
        q5.userCount();
        q5.getUserName();
        q5.insertRecord();
        q5.userCount();
        q5.queryForMap();
        q5.queryForList();
        System.out.println(q5.getUser().toString());
        q5.sessionFactory();
        UserDAO userDAO = context.getBean(UserDAO.class);
        userDAO.insert();
        q5.queryForList();
    }
}
