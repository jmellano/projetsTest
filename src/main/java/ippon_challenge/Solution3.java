package ippon_challenge;

import java.util.*;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution3 {

    public int fruitSalad(EnumMap<Provided.Fruit, Integer> fruits) {
        int nbSalade = 0;
        int nbTypeFruitAvecFruit = 0;
        List<Integer> sortedFruitList = new ArrayList<>();
        Iterator<Provided.Fruit> enumKeySet = fruits.keySet().iterator();
        while (enumKeySet.hasNext()) {
            Provided.Fruit currentFruit = enumKeySet.next();
            sortedFruitList.add(fruits.get(currentFruit));
            if (fruits.get(currentFruit) > 0) {
                nbTypeFruitAvecFruit++;
            }
        }
        Collections.sort(sortedFruitList);
        Collections.reverse(sortedFruitList);
        while (nbTypeFruitAvecFruit >= 3) {
            nbSalade++;
            sortedFruitList.set(0, sortedFruitList.get(0) - 1);
            sortedFruitList.set(1, sortedFruitList.get(1) - 1);
            sortedFruitList.set(2, sortedFruitList.get(2) - 1);
            Collections.sort(sortedFruitList);
            Collections.reverse(sortedFruitList);
            nbTypeFruitAvecFruit = checkNbFruit(sortedFruitList);
        }
        return nbSalade;
    }

    private int checkNbFruit(List<Integer> sortedFruitList) {
        int result = 0;
        for (int i = 0; i < sortedFruitList.size(); i++) {
            if (sortedFruitList.get(i) > 0) {
                result++;
            }
        }
        return result;
    }
}
