package org.ST_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testComputeAverage() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(6.0, sqrt.average(5.0, 7.0), 0.001);
    }

    @Test
    public void testCheckGoodness() {
        Sqrt sqrt = new Sqrt(16);
        assertTrue(sqrt.good(4.0, 16));
        assertFalse(sqrt.good(3.9, 16));
    }

    @Test
    public void testPerformIteration() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(4.0, sqrt.iter(2.0, 16), 0.001);
    }

    @Test
    public void testExecuteCalculation() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(4.0, sqrt.calc(), 0.001);
    }
}
