package com.spring.ConstructorInjection.InterfaceImp;

import org.springframework.stereotype.Component;

import com.spring.ConstructorInjection.Interface.Coach;

@Component // It markes the class as a Spring Bean (makes ava for dependency injection)
public class CricketCoach implements Coach {

    //adding noArg Const for this class
public CricketCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min ";
       
    }
    
}
