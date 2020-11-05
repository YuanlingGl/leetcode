package group_anagrams_lcci;

import java.util.*;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/5 9:42
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> remap = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String str = String.valueOf(ca);
            if (!remap.containsKey(str)) {
                remap.put(str, new ArrayList<>());
            }
            remap.get(str).add(s);
        }
        res.addAll(remap.values());
        return res;
    }
}