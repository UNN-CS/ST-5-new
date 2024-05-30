package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SqrtTest {
    private static final double DELTA = 0.00000001;

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.5, sqrt.average(1, 2), DELTA);
        assertEquals(2.0, sqrt.average(1, 3), DELTA);
        assertEquals(0.5, sqrt.average(0, 1), DELTA);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(1.0, 1.0));
        assertTrue(sqrt.good(2.0, 4.0));
        assertTrue(sqrt.good(1.41421356237, 2.0));  // Close to sqrt(2)
        assertFalse(sqrt.good(1.0, 2.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.5, sqrt.improve(1.0, 2.0), DELTA);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.41421356237, sqrt.iter(1.0, 2.0), DELTA); // sqrt(2)
        assertEquals(2.0, sqrt.iter(1.0, 4.0), DELTA);            // sqrt(4)
        assertEquals(3.0, sqrt.iter(1.0, 9.0), DELTA);            // sqrt(9)
        assertEquals(5.0, sqrt.iter(1.0, 25.0), DELTA);           // sqrt(25)
    }

    @Test
    public void testCalc() {
        Sqrt sqrt1 = new Sqrt(2.0);
        assertEquals(1.41421356237, sqrt1.calc(), DELTA); // sqrt(2)

        Sqrt sqrt2 = new Sqrt(4.0);
        assertEquals(2.0, sqrt2.calc(), DELTA);           // sqrt(4)

        Sqrt sqrt3 = new Sqrt(9.0);
        assertEquals(3.0, sqrt3.calc(), DELTA);           // sqrt(9)

        Sqrt sqrt5 = new Sqrt(1.0);
        assertEquals(1.0, sqrt5.calc(), DELTA);           // sqrt(1)

        Sqrt sqrt6 = new Sqrt(25.0);
        assertEquals(5.0, sqrt6.calc(), DELTA);           // sqrt(25)
    }

    @Test
    public void testNegativeNumbers() {
        Sqrt sqrt = new Sqrt(-1.0);
        assertThrows(StackOverflowError.class, sqrt::calc); // Should cause infinite recursion
    }

    @Test
    public void testEdgeCases() {
        // Very large number
        Sqrt sqrt2 = new Sqrt(1e10);
        assertEquals(100000.0, sqrt2.calc(), DELTA); // sqrt(1e10)
    }
}
