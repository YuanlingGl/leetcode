package longest_palindromic_substring;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/23 19:03
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        String ls = "babad";
        System.out.println(s.longestPalindrome(ls));
    }
}
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}