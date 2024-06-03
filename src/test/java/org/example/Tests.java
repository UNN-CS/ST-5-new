package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void TestSqrt() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(5.0, 25.0));
        assertFalse(sqrt.good(2.5, 16.0));
    }

    @Test
    public void TestImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.5, sqrt.improve(1.5, 2.25));

    }

    @Test
    public void TestAverageSqrt() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.5, sqrt.average(2.0, 3.0));
        assertEquals(15.0, sqrt.average(3.0, 27.0));
    }

    @Test
    public void TestSqrtCalculator() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 0.00001);
    }
    @Test
    public void TestIter() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(1.0, sqrt.iter(1.0, 1.0), 0.00001);
    }
}
