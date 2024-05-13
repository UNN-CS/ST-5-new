package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    double delta = 1e-4;

    @Test
    public void average() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.0, sqrt.average(-2.0, 4.0), delta);
    }

    @Test
    public void good() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2.0, 4));
        assertFalse(sqrt.good(1.9, 4));
    }

    @Test
    public void improve() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.05, sqrt.improve(2.5, 4), delta);
    }

    @Test
    public void iter() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(32.0, sqrt.iter(1.0, 1024), delta);
    }

    @Test
    public void calc() {
        Sqrt sqrt = new Sqrt(1024);
        assertEquals(32.0, sqrt.calc(), delta);
    }

    @Test(expected = StackOverflowError.class)
    public void exception() {
        Sqrt sqrt = new Sqrt(-1);
        sqrt.calc();
    }
}
