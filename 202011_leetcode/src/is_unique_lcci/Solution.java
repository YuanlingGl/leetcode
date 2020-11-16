package is_unique_lcci;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public boolean isUnique(String astr) {
        char[] a = astr.toCharArray();
        Set<Character> set = new HashSet();
        for (char b: a
             ) {
            if (set.contains(b)){
                return false;
            }
            else {
                set.add(b);
            }
        }
        return true;
    }
}