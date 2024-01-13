package org.codefinity.inheritence;

/**
 *
 * @author Sithembiso SamaJobe
 * The Parrot class inherits properties of the Bird class.
 */
public class Parrot extends Bird {
    //The name of the parrot.
    public String name;
    //Can the parrot talk?
    public boolean canTalk;
    public Parrot() {

    }

    public void talk() {
        if(canTalk)
            System.out.println("Hey I am a parrot and I can talk.");
        else
            System.out.println("Tweet.");
    }

    @Override
    public void eat() {
        System.out.println("The parrot is eating.");
    }
}