package org.codefinity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SimpleCalculatorTest {
    @Test
    void twoPlusTwoEqualsFour() {
        var mSimpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(4, mSimpleCalculator.add(2,2));
    }

    @Test
    void onePlusTwoEqualsThreeTrue() {
        var mSimpleCalculator = new SimpleCalculator();
        Assertions.assertEquals(3, mSimpleCalculator.add(1,2));
    }
}