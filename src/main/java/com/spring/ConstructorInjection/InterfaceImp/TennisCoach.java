package com.spring.ConstructorInjection.InterfaceImp;

 import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.ConstructorInjection.Interface.Coach;

@Component
 @Lazy



// Here we can't create the cons and getClass cuz we Annote this class as lazy 
// which meaks lazy class to create bean for it 

public class TennisCoach implements Coach {

//adding noArg Const for this class
public TennisCoach(){
    System.out.println("In Constructor: " +getClass().getSimpleName());
}

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    
}
