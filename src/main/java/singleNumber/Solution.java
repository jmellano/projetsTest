package singleNumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by julien on 26/03/2016.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> tableau = new HashSet<Integer>();
        for (int i = nums.length -1; i >=0 ; i--) {
            if (tableau.contains(nums[i])) {
                tableau.remove(nums[i]);
            }else{
                tableau.add(nums[i]);
            }
        }
        Iterator i = tableau.iterator();
        return ((Integer) i.next()).intValue();
    }
}
