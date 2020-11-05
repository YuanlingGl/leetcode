package longest_harmonious_subsequence;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/5
 */
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            int min = nums[i];
            while (j < nums.length && nums[j] - nums[i] <= 1) {
                j++;
            }
            res = Math.max(res, nums[j - 1] == nums[i] ? 0 : j - i);
            while (i < j && nums[i] - min < 1) {
                i++;
            }
        }
        return res;
    }
}