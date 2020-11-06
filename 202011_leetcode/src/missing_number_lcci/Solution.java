package missing_number_lcci;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/6
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}