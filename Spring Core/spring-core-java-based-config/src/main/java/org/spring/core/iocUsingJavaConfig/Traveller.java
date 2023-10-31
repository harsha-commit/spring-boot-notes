package org.spring.core.iocUsingJavaConfig;

public class Traveller {
    Vehicle vehicle;
    Traveller(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
