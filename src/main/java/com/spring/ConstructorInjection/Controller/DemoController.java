package com.spring.ConstructorInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ConstructorInjection.Interface.Coach;

@RestController
public class DemoController {
    // define a private field for the dependency 

    private Coach myCoach;

    //define a constructor for dependency injection

    @Autowired  // Constructor Injection
    public DemoController(@Qualifier ("cricketCoach") Coach theCoach){
        System.out.println("In Constructor: " +getClass().getSimpleName());
        myCoach= theCoach;
    }
        

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }




}
