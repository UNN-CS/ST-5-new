package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(2.0);
        assertTrue(sqrt.good(1.4142135, 2.0));
        assertFalse(sqrt.good(1.5, 2.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.5, sqrt.improve(1.0, 2.0));
        assertEquals(1.4166666666666665, sqrt.improve(1.5, 2.0));
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.5, sqrt.average(1.0, 2.0));
        assertEquals(3.5, sqrt.average(2.0, 5.0));
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), 0.001);
        sqrt = new Sqrt(-1.0);
        assertThrows(Throwable.class, sqrt::calc);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.4142135623746899, sqrt.iter(1.0, 2.0), 0.00001);
        assertEquals(1.4142135623746899, sqrt.iter(1.5, 2.0), 0.00001);
    }
}
