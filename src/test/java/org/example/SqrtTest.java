package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        Assert.assertEquals(3.0, sqrt.average(2, 4), 0.00000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(0);
        Assert.assertTrue(sqrt.good(1.41421356, 2));
        Assert.assertFalse(sqrt.good(1.4, 2));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        Assert.assertEquals(1.5, sqrt.improve(1, 2), 0.00000001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(2);
        Assert.assertEquals(1.41421356, sqrt.iter(1.0, 2), 0.00000001);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(2);
        Assert.assertEquals(1.41421356, sqrt.calc(), 0.00000001);
    }
}