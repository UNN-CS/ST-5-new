package org.example;


import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SqrtTest {
    static double DELTA = 1e-4;

    @Test
    public void testCalculateSquareRootOfZero() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = Math.sqrt(0.0);
        double actual = sqrt.calc();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateSquareRootOfOne() {
        double testValue = 1.0;
        Sqrt sqrt = new Sqrt(testValue);
        double expected = testValue;
        double actual = sqrt.calc();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateSquareRootOfOneHundred() {
        double testValue = 100.0;
        Sqrt sqrt = new Sqrt(testValue);
        double expected = Math.sqrt(testValue);
        double actual = sqrt.calc();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateSquareRootOfNinetyNinePointNinetyNine() {
        double testValue = 99.99;
        Sqrt sqrt = new Sqrt(testValue);
        double expected = Math.sqrt(testValue);
        double actual = sqrt.calc();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateSquareRootOfNegativeNumber() {
        Sqrt sqrt = new Sqrt(-121);
        assertThrows(Throwable.class, sqrt::calc);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 72.5;
        double actual = sqrt.average(1.0, 144.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testAverageWithEqualNumbers() {
        Sqrt sqrt = new Sqrt(0.0);
        double testValue = 10.0;
        double expected = testValue;
        double actual = sqrt.average(testValue, testValue);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testAverageOfMixedSignNumbers() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 0.0;
        double actual = sqrt.average(-144.0, 144.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testAverageOfNegativeNumbers() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = -25.0;
        double actual = sqrt.average(-20, -30);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testAverageWithSecondValueLessThanFirst() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 5.0;
        double actual = sqrt.average(10, 0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testIsGood() {
        Sqrt sqrt = new Sqrt(0.0);
        assertTrue(sqrt.good(0.04, 0.0016));
        assertFalse(sqrt.good(0.04, 0.002));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 3.0;
        double actual = sqrt.improve(1.0, 5.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testImproveWithNegativeGuessAndNegativeValue() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = -4.75;
        double actual = sqrt.improve(-10.0, -5.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testImproveWithNegativeGuessAndPositiveValue() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = -5.25;
        double actual = sqrt.improve(-10.0, 5.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testImproveWithPositiveGuessAndPositiveValue() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 5.25;
        double actual = sqrt.improve(10.0, 5.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testImproveWithZeroGuess() {
        Sqrt sqrt = new Sqrt(0.0);
        double actual = sqrt.improve(0, 5.0);
        assertTrue(Double.isInfinite(actual));
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(0.0);
        double expected = 1.0;
        double actual = sqrt.iter(1.0, 1.0);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testIterWithGoodGuess() {
        Sqrt sqrt = new Sqrt(0.0) {
            @Override
            public boolean good(double guess, double x) {
                return true;
            }

            @Override
            public double improve(double guess, double x) {
                return guess;
            }
        };

        double guess = 1.0;
        double x = 2.0;

        double expected = guess;
        double actual = sqrt.iter(guess, x);
        assertEquals(expected, actual, DELTA);
    }
}
