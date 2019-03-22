package com.example.demo.q3;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class CustomEventPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    void display() {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Publisher display");
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
