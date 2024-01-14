package org.codefinity.arraylist;

public class FullDog {
    public String name;
    public int age;

    public FullDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getFullDog() {
        return "{Name: " + this.name + " Age: " + this.age + "}";
    }
}
