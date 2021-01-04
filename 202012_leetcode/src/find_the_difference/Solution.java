package find_the_difference;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/18
 */
class Solution {
    public char findTheDifference(String s, String t) {
        int distance = 0;
        for (int i = 0; i < s.length(); ++i) {
            distance -= s.charAt(i);
            distance += t.charAt(i);
        }
        distance += t.charAt(t.length() - 1);
        return (char) distance;
    }
}