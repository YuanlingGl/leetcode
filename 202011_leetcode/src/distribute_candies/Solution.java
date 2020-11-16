package distribute_candies;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set =  new HashSet<>();
        for (int i:
             candies) {
            set.add(i);
        }
        return Math.min(set.size(),candies.length/2);
    }
}