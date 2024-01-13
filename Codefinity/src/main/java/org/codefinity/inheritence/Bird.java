package org.codefinity.inheritence;

/**
 *
 * @author Sithembiso SamaJobe
 */
public class Bird {

    //The color of the bird.
    public String color;
    //The bird flying ability
    public boolean canFly;

    //Create a default constructor
    public Bird () {

    }

    //Constructor instantiates a new Bird with Fly and color
    public Bird (String color, boolean canFly) {
        this.color = color;
        this.canFly = canFly;
    }

    public void eat() {
        System.out.println("The bird is eating.");
    }

    public void fly() {
        if(canFly)
            System.out.println("The bird can fly.");
        else
            System.out.println("The bird can not fly.");
    }
}