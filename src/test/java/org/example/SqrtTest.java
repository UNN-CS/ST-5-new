package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    double DELTA = 1e-4;

    @Test
    public void TestAvg() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(6.0, sqrt.average(-4.0, 16.0), DELTA);
    }

    @Test
    public void TestGood() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(4.0, 16));
        assertFalse(sqrt.good(1.9, 16));
    }

    @Test
    public void TestImprove() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(3.05, sqrt.improve(3.6, 9), DELTA);
    }

    @Test
    public void TestIteration() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(50.0, sqrt.iter(5.0, 2500), DELTA);
    }

    @Test
    public void TestCalculate() {
        Sqrt sqrt = new Sqrt(4096);
        assertEquals(64.0, sqrt.calc(), DELTA);
    }

    @Test(expected = StackOverflowError.class)
    public void TestException() {
        Sqrt sqrt = new Sqrt(-3);
        sqrt.calc();
    }
}
