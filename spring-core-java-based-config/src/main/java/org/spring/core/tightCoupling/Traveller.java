package org.spring.core.tightCoupling;

public class Traveller {
    Car car;
    Traveller(){
        this.car = new Car();
    }
    public void startJourney(){
        this.car.move();
    }
}
