package first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/10 20:24
 */
public class Demo {
}
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for (int i = 0; i <s.length(); i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

