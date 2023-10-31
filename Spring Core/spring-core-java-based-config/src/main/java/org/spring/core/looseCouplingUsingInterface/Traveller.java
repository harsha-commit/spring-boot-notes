package org.spring.core.looseCouplingUsingInterface;

public class Traveller {
    Vehicle vehicle;
    Traveller(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
