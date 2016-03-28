package ippon_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution1Test {

    @Test
    public void predictCrimes() throws Exception {
        Solution1 sol = new Solution1();

        //assertEquals("test",sol.predictCrimes());
    }

    @Test
    public void isSecuriteSocialeNumber() throws Exception {
        Solution1 sol = new Solution1();
        assertEquals(true,sol.isSecuriteSocialeNumber("555-55-555"));
        assertEquals(true,sol.isSecuriteSocialeNumber("098-53-125"));
        assertEquals(false,sol.isSecuriteSocialeNumber("09845-53-125"));
        assertEquals(false,sol.isSecuriteSocialeNumber("845-453-125"));
        assertEquals(false,sol.isSecuriteSocialeNumber("845-53-14325"));
        assertEquals(false,sol.isSecuriteSocialeNumber("845-53-é25"));
        assertEquals(false,sol.isSecuriteSocialeNumber("845-5r-225"));
        assertEquals(false,sol.isSecuriteSocialeNumber("8u5-5r-225"));
        assertEquals(false,sol.isSecuriteSocialeNumber("8?5-5r-225"));
    }

    @Test
    public void isPhoneNumber() throws Exception {
        Solution1 sol = new Solution1();
        assertEquals(true,sol.isPhoneNumber("1-845-555-2425"));
        assertEquals(false,sol.isPhoneNumber("1-845-545-2425"));
        assertEquals(false,sol.isPhoneNumber("2-845-555-2425"));
        assertEquals(false,sol.isPhoneNumber("a-845-555-2425"));
        assertEquals(false,sol.isPhoneNumber("1-8445-555-2425"));
        assertEquals(false,sol.isPhoneNumber("1-844-555-28425"));
        assertEquals(false,sol.isPhoneNumber("1-844-5535-8425"));
        assertEquals(false,sol.isPhoneNumber("1-844-555-84g5"));
        assertEquals(false,sol.isPhoneNumber("1-844-555-84$5"));
        assertEquals(false,sol.isPhoneNumber("1-844-555-84.5"));

    }
}