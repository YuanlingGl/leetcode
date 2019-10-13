package contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/13 21:35
 */
public class Demo {
}
class Solution{
public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
        }
        return false;
        }

}
