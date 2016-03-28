package ipponascii;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 27/03/2016.
 */
public class SolutionTest {

    @Test
    public void convertToAscii() throws Exception {
        Solution sol = new Solution();
        assertEquals  ("### ##  ##   #  ### \n" +
                       " #  # # # # # # # # \n" +
                       " #  ##  ##  # # # # \n" +
                       " #  #   #   # # # # \n" +
                       "### #   #    #  # # \n", sol.convertToAscii("iPpON"));
            }

    @Test
    public void normalize() throws Exception {
        Solution sol = new Solution();
        assertEquals("???PO", sol.normalize("./3Po"));
        assertEquals("C?PO", sol.normalize("C3Po"));
    }
}