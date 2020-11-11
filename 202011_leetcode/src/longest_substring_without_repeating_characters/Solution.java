package longest_substring_without_repeating_characters;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/11
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int maxASCII = 128;
        for (int i = 0; i < maxASCII; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }
        return res;
    }
}