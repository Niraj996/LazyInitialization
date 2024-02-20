package com.spring.ConstructorInjection.InterfaceImp;

import org.springframework.stereotype.Component;

import com.spring.ConstructorInjection.Interface.Coach;

@Component
public class BaseballCoach implements Coach {

//adding noArg Const for this class
public BaseballCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min in batting practice";
    }
    
}
