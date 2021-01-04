package first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/23
 */
class Solution {
    public int firstUniqChar(String s) {
        char[] ca = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>(ca.length);
        for (char c : ca
        ) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0;i<s.length();i++){
            if (map.get(ca[i])==1){
                return i;
            }
        }
        return -1;
    }
}