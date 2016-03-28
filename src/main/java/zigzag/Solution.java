package zigzag;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution {
    public String convert(String s, int numRows) {
        String retour = "";
        int ligne = 0;
        int colonne = 0;
        int shortColonne = 0;
        int nextColonne = numRows;
        char[][] tab = new char[numRows][s.length()];
        if (numRows <= 1 || s.equals("")) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            int reste = i % (2 * (numRows - 1));
            if (reste < numRows) {
                ligne = reste;
                shortColonne = 0;
            } else {
                ligne = 2 * (numRows - 1) - reste;
                shortColonne = 1;
            }
            if (i >= nextColonne) {
                colonne++;
                nextColonne += numRows - 2 * shortColonne;
                if (shortColonne == 1) {
                    tab[0][colonne] = '\0';
                    tab[numRows - 1][colonne] = '\0';
                }
            }
            tab[ligne][colonne] = s.charAt(i);
        }

        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i <= colonne; i++) {
                if (tab[j][i] != '\0') {
                    retour = retour.concat(String.valueOf(tab[j][i]));
                }
            }
        }

        return retour;
    }
}
