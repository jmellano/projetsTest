package twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 26/03/2016.
 */
public class SolutionTest {

    @Test
    public void twoSum() throws Exception {
        Solution sol = new Solution();
        int[] data = new int[4];
        data[0] = 2;
        data[1] = 7;
        data[2] = 11;
        data[3] = 15;


        int[] ints = sol.twoSum(data, 9);
        assertEquals(ints[0],0);
        assertEquals(ints[1],1);

        ints = sol.twoSum(data, 18);
        assertEquals(1,ints[0]);
        assertEquals(2,ints[1]);

    }
    @Test
    public void twoSum2() throws Exception {
        Solution sol = new Solution();
        int[] data = new int[3];
        data[0] = 3;
        data[1] = 2;
        data[2] = 4;


        int[] ints = sol.twoSum(data, 6);
        assertEquals(1,ints[0]);
        assertEquals(2,ints[1]);

    }
}