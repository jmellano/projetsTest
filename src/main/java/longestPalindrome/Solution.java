package longestPalindrome;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution {
    private int lo, maxLen;

    public String longestPalindrome2(String s) {
        int max = 1000;
        int min = Math.min(s.length(), max);
        return getLongest(s, min);
    }

    private String getLongest(String s, int taille) {
        boolean estPalindrome = true;
        for (int j = 0; j <= s.length() - taille; j++) {
            estPalindrome = true;
            int milieu = (int) (taille / 2);
            int k = 0;
            for (int i = milieu; i >= 0 && estPalindrome == true; i--) {
                if (s.charAt(i + j) != s.charAt(j + taille - i - 1)) {
                    estPalindrome = false;
                }
//                if (estPalindrome && s.charAt(k + j) != s.charAt(j + taille -k - 1)) {
//                    estPalindrome = false;
//                }
//                k++;
            }
            if (estPalindrome == true) {
                return s.substring(j, j + taille);
            }
        }
        if (!estPalindrome) {
            return getLongest(s, taille - 1);
        }
        return s.substring(0, 1);
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
