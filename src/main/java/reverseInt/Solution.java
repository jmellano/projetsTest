package reverseInt;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution {
    public int reverse(int x) {
        String xAbs = String.valueOf(Math.abs(x));
        int k = 0;
        char[] retourChar = new char[xAbs.length() + 1];
        if (x < 0) {
            retourChar[0] = '-';
            k++;
        }
        for (int i = xAbs.length(); i > 0; i--) {
            retourChar[k] = xAbs.charAt(i - 1);
            k++;
        }
        String retour = "";
        for (int i = 0; i < k; i++) {
            retour = retour.concat(String.valueOf(retourChar[i]));
        }
        try {
            return Integer.parseInt(retour);
        }catch (NumberFormatException n){
            return 0;
        }
    }
}
