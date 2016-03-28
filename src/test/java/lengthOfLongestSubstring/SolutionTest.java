package lengthOfLongestSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 26/03/2016.
 */
public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Solution sol = new Solution();
        assertEquals(1,sol.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,sol.lengthOfLongestSubstring("abcabcbb)"));
        assertEquals(5,sol.lengthOfLongestSubstring("abcabcdebb)"));
        assertEquals(8,sol.lengthOfLongestSubstring("abcbbcdebertyuiob"));
    }
}