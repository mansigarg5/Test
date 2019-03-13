package com.spring.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class Tea implements HotDrink {
    @Override
    public void prepareDrink() {
        System.out.println("....Preparing Tea....");
    }
}
