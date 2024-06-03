package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSqrt {

    @Test
    public void testGoodWithSmallDelta() {
        Sqrt sqrt1 = new Sqrt(0);
        sqrt1.delta = 0.0001;
        boolean result = sqrt1.good(1.41421356237, 2.0);
        assertTrue(result);
    } 

    @Test
    public void testImprove() {
        Sqrt sqrt2 = new Sqrt(0);
        double result = sqrt2.improve(1.0, 2.0);
        assertEquals(1.5, result, 0.00000001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt3 = new Sqrt(4.0);
        double result = sqrt3.iter(1.0, 4.0);
        assertEquals(2.0, result, 0.00000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt4 = new Sqrt(0);
        boolean result = sqrt4.good(1.41421356237, 2.0);
        assertTrue(result);
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        Sqrt sqrt5 = new Sqrt(0);
        double result = sqrt5.average(-4.0, -2.0);
        assertEquals(-3.0, result, 0.00000001);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt6 = new Sqrt(0);
        double result = sqrt6.average(4.0, 2.0);
        assertEquals(3.0, result, 0.00000001);
    }

}