package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testSqrtOf2() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(1.4142135623730951, result, 0.00000001);
    }

    @Test
    public void testSqrtOf4() {
        Sqrt sqrt = new Sqrt(4.0);
        double result = sqrt.calc();
        assertEquals(2.0, result, 0.00000001);
    }

    @Test
    public void testSqrtOf9() {
        Sqrt sqrt = new Sqrt(9.0);
        double result = sqrt.calc();
        assertEquals(3.0, result, 0.00000001);
    }

    @Test
    public void testSqrtOf16() {
        Sqrt sqrt = new Sqrt(16.0);
        double result = sqrt.calc();
        assertEquals(4.0, result, 0.00000001);
    }

    @Test
    public void testSqrtOfSmallNumber() {
        Sqrt sqrt = new Sqrt(0.00000001);
        double result = sqrt.calc();
        assertEquals(1.0784594750729777E-4, result, 0.00000001);
    }

    @Test
    public void testSqrtOfLargeNumber() {
        Sqrt sqrt = new Sqrt(999999999.0);
        double result = sqrt.calc();
        assertEquals(31622.7766, result, 0.0001);
    }
}