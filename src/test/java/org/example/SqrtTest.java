package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void TestAverageValue() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.5, sqrt.average(1.0, 2.0));
    }

    @Test
    public void TestGood() {
        Sqrt sqrt = new Sqrt(25.0);
        assertTrue(sqrt.good(5.0, 25.0));
        assertFalse(sqrt.good(4.9, 25.0));
    }

    @Test
    public void TestImprove() {
        Sqrt sqrt = new Sqrt(16.0);
        double guess = 4.0;
        double improved = sqrt.improve(guess, 16.0);
        assertEquals(4.0, improved, 0.001);
    }

    @Test
    public void TestIter() {
        Sqrt sqrt = new Sqrt(16.0);
        double result = sqrt.iter(4.0, 16.0);
        assertTrue(sqrt.good(result, 16.0));
    }

    @Test
    public void TestCalc() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), 0.0001);
        sqrt = new Sqrt(16.0);
        assertEquals(Math.sqrt(16.0), sqrt.calc(), 0.0001);
    }
}
