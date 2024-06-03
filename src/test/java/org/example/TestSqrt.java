package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSqrt {
    
    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.average(4.0, 2.0);
        assertEquals(3.0, result, 0.00000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(0);
        boolean result = sqrt.good(1.41421356237, 2.0);
        assertTrue(result);
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.improve(1.0, 2.0);
        assertEquals(1.5, result, 0.00000001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(4.0);
        double result = sqrt.iter(1.0, 4.0);
        assertEquals(2.0, result, 0.00000001);
    }

}