package reverseInt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 28/03/2016.
 */
public class SolutionTest {

    @Test
    public void reverse() throws Exception {
        Solution sol = new Solution();

        assertEquals(123,sol.reverse(321));
        assertEquals(-123,sol.reverse(-321));
        assertEquals(1,sol.reverse(100));

        assertEquals(0,sol.reverse(1534236469));
    }
}