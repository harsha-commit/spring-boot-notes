package org.spring.core.looseCouplingUsingInterface;

public class Car implements Vehicle{
    @Override
    public void move(){
        System.out.println("Car is moving !!");
    }
}
