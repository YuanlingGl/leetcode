package maximum_number_of_occurrences_of_a_substring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    private boolean isMatch(String str, int maxLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
            if (set.size() > maxLetters) {
                return false;
            }
        }

        return set.size() <= maxLetters;
    }

    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        //SolitudeRain 2019-12-25 "abc" 肯定会覆盖 a, ab, 即长的肯定会覆盖短的,只要考虑最短的就好咯.
        int len = s.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (i + minSize > len) {
                break;
            }
            String sub = s.substring(i, i + minSize);
            if (isMatch(sub, maxLetters)) {
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
        }
        int max = 0;
        for (String str : map.keySet()) {
            int count = map.get(str);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}