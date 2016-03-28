package ippon_fibonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by julien on 27/03/2016.
 */

public class Solution {

    public boolean isFibonacci(int estimatedWorkLoad) {
        if (estimatedWorkLoad == 0 || estimatedWorkLoad == 1) {
            return true;
        }

        int val1 = 0;
        int val2 = 1;
        while (true) {
            int tmp = val1 + val2;
            if (tmp == estimatedWorkLoad) {
                return true;
            } else if (tmp < estimatedWorkLoad) {
                val1 = val2;
                val2 = tmp;
            } else {
                return false;
            }
        }
    }

    public int[] toFibonacci(int estimatedWorkLoad) {
        List<Integer> liste = new ArrayList<>();

        liste = getDecomposition(liste, estimatedWorkLoad);
        Collections.sort(liste);

        int[] intArray = ArrayUtils.toPrimitive(liste.toArray(new Integer[liste.size()]));
        return intArray;
    }

    private List<Integer> getDecomposition(List<Integer> liste, int testedValue) {
        int previousFibonacci = previousFibonacci(testedValue);
        liste.add(previousFibonacci);
        int reste = testedValue - previousFibonacci;
        if (reste > 0) {
            liste = getDecomposition(liste, reste);
        }
        return liste;
    }

    private int previousFibonacci(int testedValue) {
        if (isFibonacci(testedValue)) {
            return testedValue;
        } else {
            return previousFibonacci(testedValue - 1);
        }
    }
}
