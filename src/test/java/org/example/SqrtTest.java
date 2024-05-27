package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest2 {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.average(0.0, 2.0));
        assertEquals(1.5, sqrt.average(1.0, 2.0));
        assertEquals(4.0, sqrt.average(3.0, 5.0));
        assertEquals(6.5, sqrt.average(4.0, 9.0));
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(1.41421356, 2.0));
        assertFalse(sqrt.good(1.414, 2.0));
        assertTrue(sqrt.good(1.73205081, 3.0));
        assertFalse(sqrt.good(1.732, 3.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.5, sqrt.improve(1.0, 2.0));
        assertEquals(1.25, sqrt.improve(1.5, 1.5));
        assertEquals(2.125, sqrt.improve(1.75, 4.5));
        assertEquals(2.5, sqrt.improve(2.0, 5.0));
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.414213562, sqrt.iter(1.0, 2.0), 0.000000001);
        assertEquals(1.732050807, sqrt.iter(1.0, 3.0), 0.000000001);
    }

    @Test
    public void testCalcPositiveNumbers() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), 0.00001);
    }

    @Test
    public void testCalcSmallNumbers() {
        Sqrt sqrt = new Sqrt(0.0001);
        assertEquals(0.01, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(0.0004);
        assertEquals(0.02, sqrt.calc(), 0.00001);
    }

    @Test
    public void testCalcLargeNumbers() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(100000000.0);
        assertEquals(10000.0, sqrt.calc(), 0.00001);
    }

    @Test
    public void testCalcNonPerfectSquares() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.414213562, sqrt.calc(), 0.000000001);
        sqrt = new Sqrt(3.0);
        assertEquals(1.732050807, sqrt.calc(), 0.000000001);
    }

    @Test
    public void testCalcNegativeNumberThrows() {
        Sqrt sqrt = new Sqrt(-1.0);
        assertThrows(IllegalArgumentException.class, sqrt::calc);
    }

    @Test
    public void testCalcEdgeCases() {
        Sqrt sqrt = new Sqrt(Double.MAX_VALUE);
        assertEquals(Math.sqrt(Double.MAX_VALUE), sqrt.calc(), 0.00001);
        sqrt = new Sqrt(Double.MIN_VALUE);
        assertEquals(Math.sqrt(Double.MIN_VALUE), sqrt.calc(), 0.00001);
    }
}