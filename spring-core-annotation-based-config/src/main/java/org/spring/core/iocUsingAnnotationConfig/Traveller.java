package org.spring.core.iocUsingAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {
    Vehicle vehicle;
    // or use @Primary on desired class
    @Autowired
    Traveller(@Qualifier("bike") Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
