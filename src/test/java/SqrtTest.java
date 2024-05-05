import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {
    static double CONST = 1e-4;

    @Test
    public void testCalc_positiveNumber() {
        Sqrt sqrt = new Sqrt(9);
        double result = sqrt.calc();
        assertEquals(3.0, result, 0.000001);
    }

    @Test
    public void testCalc_decimalNumber() {
        Sqrt sqrt = new Sqrt(2.25);
        double result = sqrt.calc();
        assertEquals(1.5, result, 0.000001);
    }

    @Test
    public void testCalc_goodTrue() {
        Sqrt s = new Sqrt(0.0);
        assertTrue(s.good(0.04, 0.0016));
    }

    @Test
    public void testCalc_iter() {
        Sqrt s = new Sqrt(0.0);
        double expected = 1.0;
        double actual = s.iter(1.0, 1.0);
        assertEquals(expected, actual, CONST);
    }

    @Test
    public void testCalc_largeNumber() {
        Sqrt sqrt = new Sqrt(10000);
        double result = sqrt.calc();
        assertEquals(100.0, result, 0.000001);
    }
}
