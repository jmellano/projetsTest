package twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by julien on 26/03/2016.
 */
public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] retour = new int[2];
//        boolean trouve = false;
//        int i = 0;
//        int j = 1;
//        while (trouve == false && i < nums.length) {
//            j = i + 1;
//            while (trouve == false && j < nums.length) {
//                if (nums[i] + nums[j] == target) {
//                    trouve = true;
//                    retour[0] = i;
//                    retour[1] = j;
//                }
//                j++;
//            }
//            i++;
//        }
//
//        return retour;
//    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
