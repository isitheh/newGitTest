package org.codefinity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DivisorClassTest {
    DivisorClass unitUnderTest = new DivisorClass();
    @Test
    void divisorMethodTest() {
        Assertions.assertEquals(5, unitUnderTest.divisorMethod(25, 5));
    }

    @Test
    void testExceptionHandlingTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> unitUnderTest.testExceptionHandling(null));
    }
}