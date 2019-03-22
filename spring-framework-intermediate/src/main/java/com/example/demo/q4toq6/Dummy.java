package com.example.demo.q4toq6;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Dummy {
    public void display1(){
        System.out.println("In display1.");
    }
    public void display2() {
        System.out.println("In display2.");
    }
    public void display3() throws IOException {
        System.out.println("In display3.");
        throw new IOException();
    }
}
