import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTests {

    @Test
    public void sqrtAverageTest(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.average(0.0, 0.0), 0.0, sqrt.delta);
        assertEquals(sqrt.average(-100.0, 100.0), 0.0, sqrt.delta);
        assertEquals(sqrt.average(2.0, 1.0), 1.5, sqrt.delta);
        assertEquals(sqrt.average(15.0, 29.0), 22.0, sqrt.delta);
        assertEquals(sqrt.average(-110.0, -90.0), -100.0, sqrt.delta);
    }

    @Test
    public void sqrtGoodTest(){
        Sqrt sqrt = new Sqrt(100.0);

        assertTrue(sqrt.good(2.0, 4.0));
        assertTrue(sqrt.good(8.0, 64.0000000000001));
        assertTrue(sqrt.good(32.0, 1024.0));

        assertFalse(sqrt.good(1.0, 4.0));
        assertFalse(sqrt.good(5.0, 17.0));
        assertFalse(sqrt.good(15.0, 112.5));
    }

    @Test
    public void sqrtImproveTest(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.improve(14.0, 8.0), 7.2857142857,sqrt.delta);
        assertEquals(sqrt.improve(13.0, 6.0), 6.7307692307,sqrt.delta);
        assertEquals(sqrt.improve(100.0, 32.0), 50.16,sqrt.delta);
        assertEquals(sqrt.improve(91.0, 4.0), 45.5219780219,sqrt.delta);
        assertEquals(sqrt.improve(7.0, 31.0), 5.71428571428,sqrt.delta);
    }

    @Test
    public void sqrtIterTest(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.iter(2.0, 4.0), 2.0, sqrt.delta);
        assertEquals(sqrt.iter(10.0, 121.0), 11.0, sqrt.delta);
        assertEquals(sqrt.iter(34.0, 80.0), 8.944271909999177, sqrt.delta);
        assertEquals(sqrt.iter(25.0, 13.0), 3.6055512754639896, sqrt.delta);
        assertEquals(sqrt.iter(94.0, 225.0), 15.0, sqrt.delta);
    }

    @Test
    public void sqrtCalcTest(){
        Sqrt sqrt1 = new Sqrt(2.0);
        Sqrt sqrt2 = new Sqrt(4.0);
        Sqrt sqrt3 = new Sqrt(64.0);
        Sqrt sqrt4 = new Sqrt(1024.0);
        Sqrt sqrt5 = new Sqrt(225.0);

        assertEquals(sqrt1.calc(), 1.414213562, sqrt1.delta);
        assertEquals(sqrt2.calc(), 2.0, sqrt2.delta);
        assertEquals(sqrt3.calc(), 8.0, sqrt3.delta);
        assertEquals(sqrt4.calc(), 32.0, sqrt4.delta);
        assertEquals(sqrt5.calc(), 15.0, sqrt5.delta);
    }
}
