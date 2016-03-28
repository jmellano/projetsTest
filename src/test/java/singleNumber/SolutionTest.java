package singleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 26/03/2016.
 */
public class SolutionTest {

    @Test
    public void singleNumber() throws Exception {
        Solution sol = new Solution();
        int[] entree1={1,2,3,4,5,1,2,3,4};
        int[] entree2={1};
        int[] entree3={1,2,3,4,5,2,3,5,4};
        assertEquals(5,sol.singleNumber(entree1));
        assertEquals(1,sol.singleNumber(entree2));
        assertEquals(1,sol.singleNumber(entree3));
    }
}