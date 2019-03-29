package com.example.event;

import com.example.entity.Student;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {
    @EventListener(Student.class)
    public void init(){
        System.out.println("Application is up for student and running");
    }
}
