package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(2.0);
        assertTrue(sqrt.good(5.0, 25.0));
        assertFalse(sqrt.good(4.999, 25.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(5.0, sqrt.improve(5.0, 25.0));
        assertEquals(3.0, sqrt.improve(3.0, 9.0));
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0));
        assertEquals(6.0, sqrt.average(4.0, 8.0));
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(36.0);
        assertEquals(6.0, sqrt.calc(), 0.00001);
        sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), 0.001);
        sqrt = new Sqrt(-9.0);
        assertThrows(Throwable.class, sqrt::calc);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(3.0, sqrt.iter(2.0, 9.0), 0.00001);
        assertEquals(3.0, sqrt.iter(2.5, 9.0), 0.00001);
    }
}
