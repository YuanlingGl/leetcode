package palindrome_permutation_lcci;

import java.util.*;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/17
 */
class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()
        ) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() <= 1;
    }
}
