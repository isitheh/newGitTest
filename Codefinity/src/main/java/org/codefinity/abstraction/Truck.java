package org.codefinity.abstraction;

public class Truck extends Vehicle {

    @Override
    public void move() {
        System.out.println("Truck moving.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }
}
