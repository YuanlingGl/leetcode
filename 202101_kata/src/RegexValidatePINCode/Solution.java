package RegexValidatePINCode;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
public class Solution {
    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        char[] pins = pin.toCharArray();
        for (char c : pins
        ) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}