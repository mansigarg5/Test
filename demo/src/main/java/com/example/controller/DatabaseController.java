package com.example.controller;

import com.example.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    @Autowired
    Database database;
    @GetMapping("/database")
    public String getDatabase(){
        return database.toString();
    }
}
