package longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/23 18:50
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int re=0,i=0,j=0;
        while(i<n&&j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                re=Math.max(re,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return re;
    }
}
