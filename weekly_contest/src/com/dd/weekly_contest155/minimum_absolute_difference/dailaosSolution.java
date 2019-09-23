package com.dd.weekly_contest155.minimum_absolute_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/23 18:32
 */
public class dailaosSolution {

        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(arr);
            int v = Integer.MAX_VALUE;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i-1] < v) {
                    res.clear();
                    v = arr[i] - arr[i-1];
                }
                if (arr[i] - arr[i-1] == v) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(arr[i-1]);
                    tmp.add(arr[i]);
                    res.add(tmp);
                }
            }
            return res;
        }

}
