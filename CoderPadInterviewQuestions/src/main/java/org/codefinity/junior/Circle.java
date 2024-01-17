package org.codefinity.junior;

public class Circle extends Shape {
    int radius;
    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @java.lang.Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
