package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testCalcForPositiveInput() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForZeroInput() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(6.103515625E-5, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForLargeInput() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForSmallInput() {
        Sqrt sqrt = new Sqrt(0.0001);
        assertEquals(6.103515625E-5, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForFractionalInput() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForNegativeFractionalInput() {
        Sqrt sqrt = new Sqrt(-2.25);
        assertEquals(Double.NaN, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForVeryLargeInput() {
        Sqrt sqrt = new Sqrt(Double.MAX_VALUE);
        assertEquals(Double.NaN, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForVerySmallInput() {
        Sqrt sqrt = new Sqrt(Double.MIN_VALUE);
        assertEquals(0.0, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForInfinityInput() {
        Sqrt sqrt = new Sqrt(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForNegativeInfinityInput() {
        Sqrt sqrt = new Sqrt(Double.NEGATIVE_INFINITY);
        assertEquals(Double.NaN, sqrt.calc(), 0.000001);
    }

    @Test
    public void testCalcForNaNInput() {
        Sqrt sqrt = new Sqrt(Double.NaN);
        assertEquals(Double.NaN, sqrt.calc(), 0.000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(true, sqrt.good(2.0, 4.0));
        assertEquals(false, sqrt.good(1.0, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.5, sqrt.improve(1.0, 4.0), 0.000001);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(1.5, sqrt.average(1.0, 2.0), 0.000001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), 0.000001);
    }
}