package ru.kudinov;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {
    public static double delta = 1e-5
    @Test
    public void testingAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.average(1.0, 3.0), delta);
        assertEquals(5.0, sqrt.average(4.0, 6.0), delta);        
        assertEquals(7.0, sqrt.average(8.0, 6.0), delta);
        assertEquals(10.0, sqrt.average(8.0, 12.0), delta);
    }

    @Test
    public void testingGood() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(3.0, 9.0));
        assertFalse(sqrt.good(2.999, 9.0));        
        assertTrue(sqrt.good(4.0, 16.0));
        assertFalse(sqrt.good(3.999, 16.0));
    }

    @Test
    public void testingImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.00, sqrt.improve(2.0, 8.0), delta);
        assertEquals(3.5, sqrt.improve(5.0, 10.0), delta);
        assertEquals(4.5, sqrt.improve(5.0, 20.0), delta);
        assertEquals(5.0, sqrt.improve(5.0, 25.0), delta);                
    }

    @Test
    public void testingIter() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), delta);
        assertEquals(2.0, sqrt.iter(1.5, 4.0), delta);
    }

    @Test
    public void testingCalc() {
        Sqrt sqrt1 = new Sqrt(-9.0);
        assertThrows(Throwable.class, sqrt1::calc);
        Sqrt sqrt2 = new Sqrt(0.0);
        assertEquals(0.0, sqrt2.calc(), delta);
        Sqrt sqrt3 = new Sqrt(25.0);
        assertEquals(5.0, sqrt3.calc(), delta);        
        Sqrt sqrt4 = new Sqrt(36.0);
        assertEquals(6.0, sqrt4.calc(), delta);
    }
}
