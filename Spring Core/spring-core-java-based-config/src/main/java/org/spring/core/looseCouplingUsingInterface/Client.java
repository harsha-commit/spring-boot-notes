package org.spring.core.looseCouplingUsingInterface;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Traveller traveller = new Traveller(vehicle);
        traveller.startJourney();
    }
}
