package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSqrt {

    @Test
    public void testPositiveNumber() {
        Sqrt sqrt = new Sqrt(25.0);
        double result = sqrt.calc();
        assertEquals(5.0, result, 0.00000001);
    }

    @Test
    public void testNegativeNumber() {
        Sqrt sqrt = new Sqrt(-1.0);
        double result = sqrt.calc();
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testZero() {
        Sqrt sqrt = new Sqrt(0.0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 0.00000001);
    }

    @Test
    public void testSmallNumber() {
        Sqrt sqrt = new Sqrt(0.00000001);
        double result = sqrt.calc();
        assertEquals(0.00001, result, 0.00000001);
    }

    @Test
    public void testLargeNumber() {
        Sqrt sqrt = new Sqrt(1.0e15);
        double result = sqrt.calc();
        assertEquals(1.0e7, result, 1.0e6); // Ожидаем ошибку в 1 порядке
    }

    @Test
    public void testVerySmallNumber() {
        Sqrt sqrt = new Sqrt(1.0e-15);
        double result = sqrt.calc();
        assertEquals(1.0e-7, result, 1.0e-8); // Ожидаем ошибку в 1 порядке
    }

    @Test
    public void testPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);
        double result = sqrt.calc();
        assertEquals(5.0, result, 0.00000001);
    }

    @Test
    public void testNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(1.41421356237, result, 0.00000001);
    }

    @Test
    public void testLargeNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(123456789.0);
        double result = sqrt.calc();
        assertEquals(11111.1110605556, result, 0.00000001);
    }

    @Test
    public void testSmallNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(0.000000000000001);
        double result = sqrt.calc();
        assertEquals(0.0000000316227766, result, 0.00000001);
    }
}