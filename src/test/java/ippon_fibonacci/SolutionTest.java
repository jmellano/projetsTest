package ippon_fibonacci;

import org.junit.After;
import org.junit.Test;
import twoSum.*;

import static org.junit.Assert.*;

/**
 * Created by julien on 27/03/2016.
 */
public class SolutionTest {

    @Test
    public void isFibonacci() throws Exception {
        Solution sol = new Solution();
        assertEquals(true, sol.isFibonacci(1));
        assertEquals(true, sol.isFibonacci(2));
        assertEquals(true, sol.isFibonacci(3));
        assertEquals(true, sol.isFibonacci(5));
        assertEquals(true, sol.isFibonacci(8));
        assertEquals(true, sol.isFibonacci(13));
        assertEquals(true, sol.isFibonacci(21));

        assertEquals(false, sol.isFibonacci(14));
        assertEquals(false, sol.isFibonacci(16));
        assertEquals(false, sol.isFibonacci(18));
        assertEquals(false, sol.isFibonacci(23));

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void toFibonacci() throws Exception {
        Solution sol = new Solution();
        int[] ints = sol.toFibonacci(28);
        assertEquals(2, ints[0]);
        assertEquals(5, ints[1]);
        assertEquals(21, ints[2]);

        int[] ints2 = sol.toFibonacci(540);
        assertEquals(1, ints2[0]);
        assertEquals(5, ints2[1]);
        assertEquals(13, ints2[2]);


    }
}