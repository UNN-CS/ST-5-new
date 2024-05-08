package ru.kriseev;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void average() {
        Sqrt s = new Sqrt(0.0);
        double expected = 2.0;
        double actual = s.average(1.0, 3.0);
        Assert.assertEquals(expected, actual, 1e-8);
    }

    @Test
    public void goodTrue() {
        Sqrt s = new Sqrt(0.0);
        Assert.assertTrue(s.good(0.0005, 0.00000025));
    }

    @Test
    public void goodFalse() {
        Sqrt s = new Sqrt(0.0);
        Assert.assertFalse(s.good(0.005, 0.00000025));
    }

    @Test
    public void improve() {
        Sqrt s = new Sqrt(0.0);
        double expected = 3.0;
        double actual = s.improve(1.0, 5.0);
        Assert.assertEquals(expected, actual, 1e-8);
    }

    @Test
    public void iterOne() {
        Sqrt s = new Sqrt(0.0);
        double expected = 1.0;
        double actual = s.iter(1.0, 1.0);
        Assert.assertEquals(expected, actual, 1e-4);
    }
    @Test
    public void iterZero() {
        Sqrt s = new Sqrt(0.0);
        double expected = 0.0;
        double actual = s.iter(1.0, 0.0);
        Assert.assertEquals(expected, actual, 1e-4);
    }
    @Test
    public void calcOne() {
        Sqrt s = new Sqrt(1.0);
        double expected = 1.0;
        double actual = s.calc();
        Assert.assertEquals(expected, actual, 1e-4);
    }
    @Test
    public void calcZero() {
        Sqrt s = new Sqrt(0.0);
        double expected = 0.0;
        double actual = s.calc();
        Assert.assertEquals(expected, actual, 1e-4);
    }
    @Test
    public void calcFour() {
        Sqrt s = new Sqrt(4.0);
        double expected = 2.0;
        double actual = s.calc();
        Assert.assertEquals(expected, actual, 1e-4);
    }
}