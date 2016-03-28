package ippon_challenge;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution2Test {

    @Test
    public void throwDices() throws Exception {
        Solution2 sol = new Solution2();
        assertEquals(BigDecimal.ZERO,sol.throwDices(6, 5));
        assertEquals(new BigDecimal("0.16667"),sol.throwDices(1, 6));
        assertEquals(new BigDecimal("0.55120"),sol.throwDices(6, 8));


    }
}