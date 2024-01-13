package org.codefinity;

import org.codefinity.inheritence.Parrot;
import org.codefinity.polymorphism.Car;
import org.codefinity.polymorphism.SUV;
import org.codefinity.polymorphism.Van;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        doInheritence();
        doPolymorphism();
    }

    private static void doInheritence() {
        Parrot rio =  new Parrot();
        //Parent Properties
        rio.color = "blue";
        rio.eat();
        rio.fly();
        rio.canFly = true;

        //Child Properties
        rio.name = "Rio";
        rio.canTalk = true;
        rio.talk();
    }

    private static void doPolymorphism() {
        Car car =  new Car();
        car.move();

        SUV suv =  new SUV();
        suv.move();

        Van van =  new Van();
        van.move();
    }
}