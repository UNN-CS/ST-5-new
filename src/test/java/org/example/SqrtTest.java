package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    double delta = 1e-6;

    @Test
    public void testSqrtAverage() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(1.0, sqrt.average(-2.0, 4.0), delta);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), delta);
    }

    @Test
    public void testSqrtGood() {
        Sqrt sqrt = new Sqrt(0.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(1.9, 4.0));
    }

    @Test
    public void testSqrtImprove() {
        Sqrt sqrt = new Sqrt(0.0);
        double res =  sqrt.improve(4.0, 4.0);
        assertEquals(2.5, res, delta);
        double res1 = sqrt.improve(2.0, 4.0);
        assertEquals(2.0, res1, delta);
    }

    @Test
    public void testSqrtIter() {
        Sqrt sqrt = new Sqrt(0.0);
        double res = sqrt.iter(1.0, 1024.0);
        assertEquals(32.0, res, delta);
    }

    @Test
    public void testSqrtCalc() {
        Sqrt sqrt = new Sqrt(1024);
        assertEquals(32.0, sqrt.calc(), delta);
        Sqrt big = new Sqrt(1e8);
        assertEquals(1e4, big.calc(), delta);
        Sqrt neg = new Sqrt(-1);
        assertThrows(StackOverflowError.class, neg::calc);
    }
}
