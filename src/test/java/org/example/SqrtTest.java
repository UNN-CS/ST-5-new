package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(81.0);
        Assertions.assertEquals(9.0, sqrt.calc(), 0.00001);
        Sqrt sqrt1 = new Sqrt(1.0);
        Assertions.assertEquals(1.0, sqrt1.calc(), 0.001);
        Sqrt sqrt2 = new Sqrt(-9.0);
        Assertions.assertThrows(Throwable.class, sqrt2::calc);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(1.0);
        Assertions.assertTrue(sqrt.good(3.0, 9.0));
        Assertions.assertFalse(sqrt.good(2.999, 9.0));
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        Assertions.assertEquals(4.5, sqrt.average(2.0, 7.0));
        Assertions.assertEquals(6.0, sqrt.average(4.0, 8.0));
    }


    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(1.0);
        Assertions.assertEquals(3.0, sqrt.iter(1.0, 9.0), 0.00001);
        Assertions.assertEquals(3.0, sqrt.iter(2.5, 9.0), 0.00001);
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(1.0);
        Assertions.assertEquals(3.5, sqrt.improve(3.0, 9.0));
        Assertions.assertEquals(2.449489742783178, sqrt.improve(2.0, 6.0));
    }
}