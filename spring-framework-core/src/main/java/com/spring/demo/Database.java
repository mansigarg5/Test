package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database {
    String port;
    String name;

    public void setPort(String port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port='" + port + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = applicationContext.getBean("database", Database.class);
        System.out.println(database.toString());
    }
}
