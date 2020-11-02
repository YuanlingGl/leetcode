package intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//        int[] re = new int[nums1.length + nums2.length];
        Set set1 = new HashSet();
        Set set2 = new HashSet();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        return getintersection(set1, set2);
    }

    public int[] getintersection(Set<Integer> set1, Set set2) {
        if (set1.size() < set2.size()) {
            getintersection(set2, set1);
        }
        Set<Integer> set3 = new HashSet();
        for (int i : set1) {
            if (set2.contains(i)) {
                set3.add(i);
            }
        }
        int[] re = new int[set3.size()];
        int index = 0;
        for (int i : set3) {
            re[index++] = i;
        }
        return re;
    }
}