package org.spring.core.looseCouplingUsingInterface;

public class Bike implements Vehicle {
    @Override
    public void move(){
        System.out.println("Bike is moving !!");
    }
}
