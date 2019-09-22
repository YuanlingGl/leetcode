package com.dd.biweekly_contest_9.find_smallest_common_element_in_all_rows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/21 23:25
 */
//error
class Solution {
    public int smallestCommonElement(int[][] mat) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int first = 1;
        for (int[] i:
             mat) {
            if (first==1){
                for (int j:
                     i) {
                    map.put(j,1);
                }
            }else {
                for (int j:
                     i) {
                    if (!map.containsKey(j)){
                        map.remove(j);
                    }

                }
            }

        }
        if (map.isEmpty()){
            return -1;
        }

        return (int) getMinKey(map);
    }
    public static Object getMinKey(Map<Integer, Integer> map) {
        if (map == null) return null;
        Set<Integer> set = map.keySet();
        Object[] a = set.toArray();
        Arrays.sort(a);
        return a[0];
    }
}
