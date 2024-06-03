package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(9.0);
        double guess = 3.0;
        double improved = sqrt.improve(guess, 9.0);
        assertEquals(3.0, improved, 0.001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
        assertFalse(sqrt.good(3.9, 16.0));
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.5, sqrt.average(1.0, 2.0));
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.0001);
        sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 0.0001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(25.0);
        double result = sqrt.iter(5.0, 25.0);
        assertTrue(sqrt.good(result, 25.0));
    }
}
