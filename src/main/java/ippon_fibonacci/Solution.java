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

    public int[] toFibonacci2(int estimatedWorkLoad) {
        List<Integer> fibListe;
        List<Integer> decomposition = new ArrayList<>();
        int reste = estimatedWorkLoad;
        if (estimatedWorkLoad > 2) {
            fibListe = getFibonacciTo(estimatedWorkLoad);
            while (reste > 0) {
                Integer lastFibToAdd = fibListe.get(fibListe.size() - 1);
                decomposition.add(lastFibToAdd);
                reste = reste - lastFibToAdd;
                fibListe = cleanListe(fibListe, reste);
            }
        } else {
            return new int[]{estimatedWorkLoad};
        }
        int[] retour = new int[decomposition.size()];
        for (int i = 0; i < decomposition.size(); i++) {
            retour[i] = decomposition.get(i);
        }
        return retour;
    }

    private List<Integer> cleanListe(List<Integer> fibListe, int reste) {
        while (fibListe.size() > 0 && fibListe.get(fibListe.size() - 1) > reste) {
            fibListe.remove(fibListe.size() - 1);
        }
        return fibListe;
    }

    private List<Integer> getFibonacciTo(int estimatedWorkLoad) {
        List<Integer> fibList = new ArrayList<>();
        fibList.add(1);
        fibList.add(2);
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= estimatedWorkLoad; ) {
            int next = prev1 + prev2;
            if (next <= estimatedWorkLoad) {
                fibList.add(next);
            }
            prev1 = prev2;
            prev2 = next;
            i = next;
        }
        return fibList;
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
