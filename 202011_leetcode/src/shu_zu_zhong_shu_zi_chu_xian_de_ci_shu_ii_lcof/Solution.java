package shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int re = 0;
        for (int key : map.keySet()) {
            if (map.get(key) != 3) {
                re = key;
            }
        }
        return re;
    }
}