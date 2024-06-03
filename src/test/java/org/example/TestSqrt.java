package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSqrt {

    @Test
    public void testGoodWithSmallDelta() {
        Sqrt sqrt6 = new Sqrt(0);
        sqrt6.delta = 0.0001;
        boolean result = sqrt6.good(1.41421356237, 2.0);
        assertTrue(result);
    }

    

    @Test
    public void testImprove() {
        Sqrt sqrt3 = new Sqrt(0);
        double result = sqrt3.improve(1.0, 2.0);
        assertEquals(1.5, result, 0.00000001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt4 = new Sqrt(4.0);
        double result = sqrt4.iter(1.0, 4.0);
        assertEquals(2.0, result, 0.00000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt2 = new Sqrt(0);
        boolean result = sqrt2.good(1.41421356237, 2.0);
        assertTrue(result);
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        Sqrt sqrt5 = new Sqrt(0);
        double result = sqrt5.average(-4.0, -2.0);
        assertEquals(-3.0, result, 0.00000001);
    }

    @Test
    public void testImproveWithLargeNumbers() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.improve(1000000.0, 200000000000.0);
        assertEquals(6000.0, result, 0.00000001);
    }
    
    @Test
    public void testAverage() {
        Sqrt sqrt1 = new Sqrt(0);
        double result = sqrt1.average(4.0, 2.0);
        assertEquals(3.0, result, 0.00000001);
    }

}