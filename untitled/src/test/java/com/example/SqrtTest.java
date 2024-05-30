package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testPositiveNumber() {
        sqrt sqrtCalc = new sqrt(16.0);
        assertEquals(4.0, sqrtCalc.calc(), sqrtCalc.delta);
    }

    @Test
    public void testZero() {
        sqrt sqrtCalc = new sqrt(0.0);
        double expected = 0.0;
        double actual = sqrtCalc.calc();
        double tolerance = 1e-4;
        assertEquals(expected, actual, tolerance);
    }

    @Test
    public void testOne() {
        sqrt sqrtCalc = new sqrt(1.0);
        assertEquals(1.0, sqrtCalc.calc(), sqrtCalc.delta);
    }

    @Test
    public void testSmallNumber() {
        sqrt sqrtCalc = new sqrt(0.0001);
        assertEquals(0.01, sqrtCalc.calc(), sqrtCalc.delta);
    }

    @Test
    public void testLargeNumber() {
        sqrt sqrtCalc = new sqrt(1_000_000.0);
        assertEquals(1_000.0, sqrtCalc.calc(), sqrtCalc.delta);
    }

    @Test
    public void testImprove() {
        sqrt sqrtCalc = new sqrt(25.0);
        double guess = 1.0;
        double improvedGuess = sqrtCalc.improve(guess, 25.0);
        assertNotEquals(guess, improvedGuess);
    }

    @Test
    public void testGoodGuess() {
        sqrt sqrtCalc = new sqrt(25.0);
        assertTrue(sqrtCalc.good(5.0, 25.0));
    }

    @Test
    public void testBadGuess() {
        sqrt sqrtCalc = new sqrt(25.0);
        assertFalse(sqrtCalc.good(4.0, 25.0));
    }

    @Test
    public void testAverage() {
        sqrt sqrtCalc = new sqrt(25.0);
        assertEquals(5.0, sqrtCalc.average(4.0, 6.0), sqrtCalc.delta);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testPerformance() {
        sqrt sqrtCalc = new sqrt(1_000_000.0);
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            assertEquals(1_000.0, sqrtCalc.calc(), sqrtCalc.delta);
        });
    }

    @Test
    public void testNegativeNumber() {
        sqrt sqrtCalc = new sqrt(-16.0);
        assertThrows(StackOverflowError.class, sqrtCalc::calc);
    }
}
