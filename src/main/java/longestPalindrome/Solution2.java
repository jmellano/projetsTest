package longestPalindrome;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution2 {
    public String longestPalindrome(String src) {
        if (src.length() <= 1) {
            return src;
        }

        int[] p = new int[src.length() * 2 + 2];
        char[] str = new char[p.length];
        for (int i = 0, k = 0, j = src.length(); i < j; i++) {
            char c = src.charAt(i);
            str[++k] = '#';
            str[++k] = c;
        }
        str[str.length - 1] = '#';

        for (int i = 1, mx = 0, id = 0; i < str.length; i++) {
            if (mx > i) {
                p[i] = Math.min(p[2 * id - i], mx - i);
            } else {
                p[i] = 1;
            }
            for (; i + p[i] < str.length && str[i + p[i]] == str[i - p[i]]; p[i]++) {
            }
            if (p[i] + i > mx) {
                mx = p[i] + i;
                id = i;
            }
        }

        int maxIdx = 0;
        for (int i = 1; i < p.length; i++) {
            if (p[i] > p[maxIdx]) {
                maxIdx = i;
            }
        }
        int start = maxIdx - p[maxIdx] + 1;
        char[] chars = new char[p[maxIdx]];
        int j = 0;
        for (int i = start; i <= maxIdx; i++) {
            if (str[i] != '#') {
                chars[j++] = str[i];
            }
        }
        for (int i = maxIdx + 1, k = 2 * maxIdx - start; i <= k; i++) {
            if (str[i] != '#') {
                chars[j++] = str[i];
            }
        }
        return new String(chars, 0, j);
    }
}