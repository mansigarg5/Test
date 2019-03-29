package com.example.entity;

import org.springframework.beans.factory.annotation.Value;

public class Database {
    @Value("${database.name}")
    private String name;
    @Value("${database.port}")
    private int port;

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
