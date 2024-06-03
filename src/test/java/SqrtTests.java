import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTests {

    @Test
    public void sqrtAverageTestOne(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.average(0.0, 0.0), 0.0, sqrt.delta);
    }

    @Test
    public void sqrtAverageTestTwo(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.average(-100.0, 100.0), 0.0, sqrt.delta);
    }

    @Test
    public void sqrtAverageTesThree(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.average(15.0, 29.0), 22.0, sqrt.delta);
    }

    @Test
    public void sqrtGoodTestOne(){
        Sqrt sqrt = new Sqrt(100.0);

        assertTrue(sqrt.good(2.0, 4.0));

        assertFalse(sqrt.good(15.0, 112.5));
    }

    @Test
    public void sqrtGoodTestTwo(){
        Sqrt sqrt = new Sqrt(100.0);

        assertTrue(sqrt.good(32.0, 1024.0));

        assertFalse(sqrt.good(1.0, 4.0));
            }

    @Test
    public void sqrtGoodTestThree(){
        Sqrt sqrt = new Sqrt(100.0);

        assertTrue(sqrt.good(8.0, 64.0000000000001));

        assertFalse(sqrt.good(5.0, 17.0));
    }

    @Test
    public void sqrtImproveTestOne(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.improve(14.0, 8.0), 7.2857142857,sqrt.delta);
    }

    @Test
    public void sqrtImproveTestTwo(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.improve(100.0, 32.0), 50.16,sqrt.delta);
    }

    @Test
    public void sqrtImproveTestThree(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.improve(91.0, 4.0), 45.5219780219,sqrt.delta);
    }

    @Test
    public void sqrtIterTestOne(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.iter(2.0, 4.0), 2.0, sqrt.delta);
    }

    @Test
    public void sqrtIterTestTwo(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.iter(34.0, 80.0), 8.944271909999177, sqrt.delta);
    }

    @Test
    public void sqrtIterTestThree(){
        Sqrt sqrt = new Sqrt(100.0);

        assertEquals(sqrt.iter(94.0, 225.0), 15.0, sqrt.delta);
    }

    @Test
    public void sqrtCalcTestOne(){
        Sqrt sqrt = new Sqrt(2.0);

        assertEquals(sqrt.calc(), 1.414213562, sqrt.delta);
    }

    @Test
    public void sqrtCalcTesTwo(){
        Sqrt sqrt = new Sqrt(4.0);

        assertEquals(sqrt.calc(), 2.0, sqrt.delta);
    }

    @Test
    public void sqrtCalcTesThree(){
        Sqrt sqrt = new Sqrt(1024.0);

        assertEquals(sqrt.calc(), 32.0, sqrt.delta);
    }
}
