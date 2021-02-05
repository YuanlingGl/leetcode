package LongestConsec;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/1
 */
import java.util.Arrays;
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || strarr.length < k || k <= 0) {
            return "";
        }
        // your code
        StringBuilder[] stringBuilders = new StringBuilder[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            stringBuilders[i] = new StringBuilder("");
            if (strarr.length - k - i < 0) {
                k--;
            }
            for (int j = 0; j < k; j++) {
                stringBuilders[i].append(strarr[i + j]);
            }
        }
        int maxlen = Arrays.stream(stringBuilders).mapToInt(StringBuilder::length).max().getAsInt();
        for (StringBuilder s : stringBuilders
        ) {
            if (s.length() == maxlen) {
                return s.toString();
            }
        }
        return "";
    }
}