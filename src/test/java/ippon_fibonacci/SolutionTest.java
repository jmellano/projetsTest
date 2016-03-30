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
        int[] ints = sol.toFibonacci2(28);
        assertEquals(2, ints[2]);
        assertEquals(5, ints[1]);
        assertEquals(21, ints[0]);

        int[] ints2 = sol.toFibonacci2(540);
        assertEquals(377, ints2[0]);
        assertEquals(144, ints2[1]);
        assertEquals(13, ints2[2]);
        assertEquals(5, ints2[3]);
        assertEquals(1, ints2[4]);

        int[] ints3 = sol.toFibonacci2(100540);
        assertEquals(75025, ints3[0]);
        assertEquals(17711, ints3[1]);
        assertEquals(6765, ints3[2]);
        assertEquals(987, ints3[3]);
        assertEquals(34, ints3[4]);
        assertEquals(13, ints3[5]);
        assertEquals(5, ints3[6]);

        int[] ints4 = sol.toFibonacci2(1);
        assertEquals(1, ints4[0]);
        int[] ints5 = sol.toFibonacci2(2);
        assertEquals(2, ints5[0]);
        int[] ints6 = sol.toFibonacci2(0);
        assertEquals(0, ints6[0]);

    }
}