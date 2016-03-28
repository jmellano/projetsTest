package zigzag;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 28/03/2016.
 */
public class SolutionTest {

    @Test
    public void convert() throws Exception {
        Solution sol = new Solution();
        assertEquals("PHASIYIRPLIGAN",sol.convert("PAYPALISHIRING",5));
        assertEquals("PAHNAPLSIIGYIR",sol.convert("PAYPALISHIRING",3));
        assertEquals("",sol.convert("",1));
        assertEquals("ACB",sol.convert("ABC",2));
    }
}