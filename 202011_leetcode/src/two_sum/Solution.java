package two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/23
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}