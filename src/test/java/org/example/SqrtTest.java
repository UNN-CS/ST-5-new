package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(4.0, 16.0));
        assertFalse(sqrt.good(3.999, 16.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(4.0, sqrt.improve(4.0, 16.0));
        assertEquals(2.25, sqrt.improve(2.0, 5.0));
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.average(1.0, 3.0));
        assertEquals(5.0, sqrt.average(3.0, 7.0));
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 0.001);
        sqrt = new Sqrt(-4.0);
        assertThrows(Throwable.class, sqrt::calc);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), 0.00001);
        assertEquals(2.0, sqrt.iter(1.5, 4.0), 0.00001);
    }
}
