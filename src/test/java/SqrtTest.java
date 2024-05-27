import com.example.Sqrt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testCalculateRootPositiveNum() {
        Sqrt s = new Sqrt(169);
        assertEquals(13.0, s.calc(), 0.000001);
    }

    @Test
    public void testCalculateRootOfFractionalNotGoodNum() {
        Sqrt s = new Sqrt(2.0);
        assertEquals(1.41421356, s.calc(), 0.00000001);
    }

    @Test
    public void testCalculateRootLargeNum() {
        Sqrt s = new Sqrt(1000000);
        assertEquals(1000.0, s.calc(), 0.00000001);
    }

    @Test
    public void testCalculateRootAverage() {
        Sqrt s = new Sqrt(4);
        assertEquals(2.5, s.average(2, 3), 0.000001);
    }

    @Test
    public void testIsGoodNum() {
        Sqrt s = new Sqrt(16);
        assertTrue(s.good(4.0, 16));
        assertFalse(s.good(4.1, 16));
    }

    @Test
    public void testIterRootCalculation() {
        Sqrt s = new Sqrt(25);
        assertEquals(5.0, s.iter(1.0, 25), 0.0001);
    }
    @Test
    public void testCalcMethod() {
        Sqrt s = new Sqrt(144);
        assertEquals(12.0, s.calc(), 0.0001);
    }
    @Test
    public void testCalcMethodWithZero() {
        Sqrt s = new Sqrt(0);
        assertEquals(0.0, s.calc(), 0.0001);
    }
    @Test
    public void testRootOfLitleNum() {
        Sqrt s = new Sqrt(0.0001);
        assertEquals(0.01, s.calc(), 0.00000001);
    }
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testCalculateRootOfNegativeNum() {
        Sqrt s = new Sqrt(-49.0);
        assertThrows(StackOverflowError.class, s::calc);
    }
    @Test
    public void testCalculateRootOfVeryBigNum() {
        Sqrt s = new Sqrt(1e12);
        assertEquals(1e6, s.calc(), 0.00000001);
    }
    @Test
    public void testCalculateRootOfVeryLittleNum() {
        Sqrt s = new Sqrt(1e-12);
        assertEquals(6.104061748558114E-5, s.calc(), 0.00000001);
    }

    @Test
    public void testCalculateRootOf1() {
        Sqrt s = new Sqrt(1.0);
        assertEquals(1.0, s.calc(), 0.00000001);
    }


}
