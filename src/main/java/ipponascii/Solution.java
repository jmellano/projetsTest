package ipponascii;

/**
 * Created by julien on 27/03/2016.
 */
public class Solution {
    // Longueur d'une lettre en ASCII art
    final int length = 4;
    // Hauteur d'une lettre en ASCII art
    final int height = 5;
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ? en ASCII art
    final String[] asciiAlphabet =
                   {" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                    "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                    "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                    "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                    "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  "};


    public String convertToAscii(String word) {
        word = normalize(word);
        String[] chaineTampon = new String[height];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int j = 0; j < height; j++) {
                if(j==0){
                    chaineTampon[j]="";
                }
                if (c == 63) {
                    chaineTampon[j] = chaineTampon[j] + asciiAlphabet[j].substring(26*length,27*length);
                }else{
                    chaineTampon[j] = chaineTampon[j] + asciiAlphabet[j].substring((c - 65)*length,(c - 64)*length);
                }
                if(i==word.length()-1){
                    chaineTampon[j] = chaineTampon[j].concat("\n");
                }
            }
        }
        String retour="";
        for(int i=0; i<height;i++){
            retour=retour.concat(chaineTampon[i]);
        }

        return retour;
    }

    public String normalize(String word) {
        word = word.toUpperCase().trim();
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (!Character.isLetter(c)) {
                word = word.replace(c, '?');
            }
        }
        return word;
    }
}
