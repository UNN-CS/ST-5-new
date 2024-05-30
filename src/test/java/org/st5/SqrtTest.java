// Copyright 2024 Nedelin Dmitry
package org.st5;


import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class SqrtTest {
    private static final double DELTA = 0.00000001;

    @Test
    public void ConstructFunctionTest() {
        Sqrt sqrt = new Sqrt(5);
        assertNotNull(sqrt);
    }

    @Test
    public void IteratorFunctionTest() {
        Sqrt sqrt = new Sqrt(3);
        assertEquals(2.0, sqrt.iter(1, 4), DELTA);
    }

    @Test
    public void CalculatedFunctionCheck() {
        Sqrt sqrt = new Sqrt(81);
        assertEquals(9.0, sqrt.calc(), DELTA);
    }

    @Test
    public void CalculatedFunctionBigNumTest() {
        Sqrt sqrt = new Sqrt(46403344);
        assertEquals(6812.0, sqrt.calc(), DELTA);
    }

    @Test
    public void CalculatedFunctionSmallNumTest() {
        Sqrt sqrt = new Sqrt(9e-4);
        assertEquals(0.030000012746348552, sqrt.calc(), DELTA);
    }

    @Test
    public void FindingAverageValFunctionTest() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(9, sqrt.average(9, 9), DELTA);
    }

    @Test
    public void FindingGoodOddFunctionTest() {
        Sqrt sqrt = new Sqrt(2);
        assertFalse(sqrt.good(3, 4));
        assertTrue(sqrt.good(2, 4));
    }

    @Test
    public void ImprovedFunctionsTest() {
        Sqrt sqrt = new Sqrt(2);
        assertEquals(3.5, sqrt.improve(2, 10), DELTA);
    }
}
