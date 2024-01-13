package org.codefinity.polymorphism;

public class Van extends Car {
    @Override
    public void move() {
        System.out.println("Van has started moving.");
    }
}
