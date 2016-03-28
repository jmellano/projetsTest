package ippon_challenge;

import org.junit.Test;

import java.util.EnumMap;

import static ippon_challenge.Provided.*;
import static org.junit.Assert.*;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution3Test {

    @Test
    public void fruitSalad() throws Exception {
        Solution3 sol = new Solution3();

        EnumMap<Provided.Fruit, Integer> fruits = new EnumMap<Fruit, Integer>(Fruit.class);
        fruits.put(Fruit.BANANA,1);
        fruits.put(Fruit.APRICOT,1);
        fruits.put(Fruit.ORANGE,5);
        fruits.put(Fruit.APPLE,2);
        fruits.put(Fruit.PEAR,0);

        assertEquals(2,sol.fruitSalad(fruits));
    }
    @Test
    public void fruitSalad2() throws Exception {
        Solution3 sol = new Solution3();

        EnumMap<Provided.Fruit, Integer> fruits = new EnumMap<Fruit, Integer>(Fruit.class);
        fruits.put(Fruit.BANANA,2);
        fruits.put(Fruit.APRICOT,2);
        fruits.put(Fruit.ORANGE,2);
        fruits.put(Fruit.APPLE,2);
        fruits.put(Fruit.PEAR,2);

        assertEquals(3,sol.fruitSalad(fruits));
    }


}