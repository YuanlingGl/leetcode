package valid_anagram;

import java.util.Arrays;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/09 21:19
 */
public class Demo {
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}