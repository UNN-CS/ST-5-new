package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SqrtTest {

    @Test
    public void testAverage() {
        double val = Double.parseDouble("3.0");
        Sqrt sqrt = new Sqrt(val);

        assertEquals(sqrt.average(0.0, 0.0), 0.0, sqrt.delta);
        assertEquals(sqrt.average(1.0, 1.0), 1.0, sqrt.delta);
        assertEquals(sqrt.average(-5.0, 3.5), -0.75, sqrt.delta);
        assertEquals(sqrt.average(5.0, 2.5), 3.75, sqrt.delta);
    }

    @Test
    public void testGood() {
        double val = Double.parseDouble("3.0");
        Sqrt sqrt = new Sqrt(val);

        assertTrue(sqrt.good(2.0,4.0));
        assertTrue(sqrt.good(4.0,16.000000001));
        assertTrue(sqrt.good(-4.0,15.999999999));
        assertFalse(sqrt.good(10.0,16.0));
        assertFalse(sqrt.good(0.0,2.0));
        assertFalse(sqrt.good(1.0,-5.0));
    }

    @Test
    public void testImprove() {
        double val = Double.parseDouble("3.0");
        Sqrt sqrt = new Sqrt(val);

        assertEquals(sqrt.improve(1.0, 1.0), 1.0, sqrt.delta);
        assertEquals(sqrt.improve(5.0, 5.0), 3.0, sqrt.delta);
        assertEquals(sqrt.improve(10.0, 2.0), 5.1, sqrt.delta);
        assertEquals(sqrt.improve(-5.0, 5.0), -2.999999999, sqrt.delta);
    }

    @Test
    public void testIter() {
        double val = Double.parseDouble("3.0");
        Sqrt sqrt = new Sqrt(val);

        assertEquals(sqrt.iter(0.0, 0.0), 0.0, sqrt.delta);
        assertEquals(sqrt.iter(3.0, 2.0), 1.41421356, sqrt.delta);
        assertEquals(sqrt.iter(5.0, 2.0), 1.414213562, sqrt.delta);
        assertEquals(sqrt.iter(-8.0, 4.0), -2.0, sqrt.delta);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt1 = new Sqrt(2.0);
        Sqrt sqrt2 = new Sqrt(5.0);
        Sqrt sqrt3 = new Sqrt(12.0);
        Sqrt sqrt4 = new Sqrt(16.0);
        Sqrt sqrt5 = new Sqrt(-20.0);

        assertEquals(sqrt1.calc(), 1.414213562, sqrt1.delta);
        assertEquals(sqrt2.calc(), 2.236067977, sqrt2.delta);
        assertEquals(sqrt3.calc(), 3.464101615, sqrt3.delta);
        assertEquals(sqrt4.calc(), 4.0, sqrt4.delta);
        assertThrows(Throwable.class, sqrt5::calc);
    }
}