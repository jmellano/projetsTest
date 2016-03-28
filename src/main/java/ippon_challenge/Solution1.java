package ippon_challenge;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by julien on 28/03/2016.
 */
public class Solution1 {

    public String predictCrimes() {
        String result = "";
        for (int i = 0; i < 30; i++) {
            if (i > 0) {
                result = result.concat("\n");
            }
            result = result.concat("Crime predicted: ".concat(generateSocialNumber(result)).concat("\n"));
            result = result.concat("Calling: ".concat(generatePhoneNumber(result)).concat("\n"));
        }

        return result;
    }


    private String generatePhoneNumber(String result) {
        String phoneNumber = "";
        do {
            phoneNumber = "1";
            String firstPart = String.format("%03d", (int) (Math.random() * 1000));
            String lastPart = String.format("%04d", (int) (Math.random() * 10000));
            phoneNumber = phoneNumber.concat("-").concat(firstPart).concat("-555-").concat(lastPart);
        } while (!isUniquePhoneNumber(result, phoneNumber));

        return phoneNumber;
    }

    private boolean isUniquePhoneNumber(String result, String phoneNumber) {
        String searchString = "Calling: ".concat(phoneNumber);
        return !result.matches(searchString);
    }

    private String generateSocialNumber(String result) {
        String socialNumber = "";
        do {
            socialNumber = "";
            String firstPart = String.format("%03d", (int) (Math.random() * 1000));
            String secondPart = String.format("%02d", (int) (Math.random() * 100));
            String lastPart = String.format("%04d", (int) (Math.random() * 10000));
            socialNumber = firstPart.concat("-").concat(secondPart).concat("-").concat(lastPart);
        } while (!isUniqueSocialNumber(result, socialNumber));

        return socialNumber;
    }

    private boolean isUniqueSocialNumber(String result, String socialNumber) {
        String searchString = "Crime predicted: ".concat(socialNumber);
        return !result.matches(searchString);
    }

    public Boolean isSecuriteSocialeNumber(String secu) {
        boolean result = false;
        if (secu.matches("^(\\d{3}-\\d{2}-\\d{3})$")) {
            result = true;
        }

        return result;
    }


    public Boolean isPhoneNumber(String number) {
        boolean result = false;
        if (number.matches("^([1]-\\d{3}-[5]{3}-\\d{4})$")) {
            result = true;
        }

        return result;
    }
}
