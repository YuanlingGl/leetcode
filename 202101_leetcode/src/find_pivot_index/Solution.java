package find_pivot_index;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/28
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}