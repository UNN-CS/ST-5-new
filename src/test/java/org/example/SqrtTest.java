package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testSqrtOfOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfTwo() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfThree() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(Math.sqrt(3.0), sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfFour() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfTwentyFive() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfSmallDecimal() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfDecimal() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfDecimalLarge() {
        Sqrt sqrt = new Sqrt(12.25);
        assertEquals(3.5, sqrt.calc(), 0.00000001);
    }

    @Test
    public void testSqrtOfVerySmallNumber() {
        Sqrt sqrt = new Sqrt(1e-10);
        assertEquals(1e-5, sqrt.calc(), 0.00000001);
    }

}