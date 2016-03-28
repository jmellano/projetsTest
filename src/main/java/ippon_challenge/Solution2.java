package ippon_challenge;

import java.math.BigDecimal;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution2 {
    public BigDecimal throwDices(int D, int F) {
        BigDecimal result = BigDecimal.ZERO;

        if(F < 6){
            return result;
        }
        int nbpossibilite=F-1;
        BigDecimal probaUnDe = BigDecimal.valueOf(nbpossibilite).divide(BigDecimal.valueOf(F),10,BigDecimal.ROUND_HALF_DOWN);
        double probaNDes = Math.pow(probaUnDe.doubleValue(),D);
        result =BigDecimal.valueOf(1-probaNDes);

        return result.setScale(5,BigDecimal.ROUND_HALF_DOWN);
    }
}
