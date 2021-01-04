package assign_cookies;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/25
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookie = 0;
        int children = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (children < g.length && cookie < s.length) {
            if (g[children] <= s[cookie]) {
                children++;
            }
            cookie++;
        }
        return children;
    }
}