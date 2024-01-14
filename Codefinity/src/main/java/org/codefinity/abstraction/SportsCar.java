package org.codefinity.abstraction;

public class SportsCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("SportsCar moving.");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar stopped.");
    }
}
