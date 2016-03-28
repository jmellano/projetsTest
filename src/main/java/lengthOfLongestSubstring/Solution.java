package lengthOfLongestSubstring;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by julien on 26/03/2016.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int retour = 0;
        Map<Character, Integer> mapString = new HashMap<Character, Integer>();
        Map<Integer, Character> mapInt = new HashMap<Integer, Character>();
        String currentSubstring = "";
        int indexDernierClean = 0;
        for (int i = 0; i < s.length(); i++) {
            mapInt.put(i, s.charAt(i));
            if (!mapString.containsKey(s.charAt(i))) {
                currentSubstring = currentSubstring.concat(String.valueOf(s.charAt(i)));
                retour = Math.max(retour, currentSubstring.length());
            } else {
                currentSubstring = s.substring(mapString.get(s.charAt(i)) + 1, i + 1);
                int max = mapString.get(s.charAt(i));
                for (int j = indexDernierClean; j <= max; j++) {
                    Character c = mapInt.get(j);
                    mapString.remove(c);
                    mapInt.remove(j);
                }
                indexDernierClean = max;
            }
            mapString.put(s.charAt(i), i);
        }

        return retour;
    }

}
