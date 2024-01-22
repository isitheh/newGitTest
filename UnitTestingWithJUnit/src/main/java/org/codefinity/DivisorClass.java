package org.codefinity;

public class DivisorClass {
    public double divisorMethod(int a, int b) {
        double result = 0;
        if(b  != 0) {
            result = (double) a / b;
        }
        return result;
    }

    public void testExceptionHandling(String myParameter) {
        if (myParameter == null) {
            throw new IllegalArgumentException("Parameter 'myParameter' cannot be null");
        }
    }
}
