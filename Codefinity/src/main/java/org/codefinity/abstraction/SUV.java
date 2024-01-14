package org.codefinity.abstraction;

public class SUV extends Vehicle {

    @Override
    public void move() {
        System.out.println("SUV moving.");
    }

    @Override
    public void stop() {
        System.out.println("SUV stopped.");
    }
}
