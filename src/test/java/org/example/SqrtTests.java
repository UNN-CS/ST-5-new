package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtTests {
    private Sqrt sqrt;

    @Test
    public void testAverage() {
        sqrt = new Sqrt(16.0);
        double result = sqrt.average(4.0, 8.0);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    public void testGood() {
        sqrt = new Sqrt(16.0);
        boolean result1 = sqrt.good(4.0, 16.0);
        Assertions.assertTrue(result1);

        boolean result2 = sqrt.good(3.0, 16.0);
        Assertions.assertFalse(result2);
    }

    @Test
    public void testImprove() {
        sqrt = new Sqrt(16.0);
        double result = sqrt.improve(4.0, 16.0);
        Assertions.assertEquals(4.0, result, sqrt.delta);
    }

    @Test
    public void testIter() {
        sqrt = new Sqrt(16.0);
        double result1 = sqrt.iter(4.0, 16.0);
        Assertions.assertEquals(4.0, result1, sqrt.delta);

        double result2 = sqrt.iter(1.0, 16.0);
        Assertions.assertEquals(4.0, result2, sqrt.delta);
    }

    @Test
    public void testCalc() {
        sqrt = new Sqrt(16.0);
        double result = sqrt.calc();
        Assertions.assertEquals(4.0, result, sqrt.delta);
    }
}
