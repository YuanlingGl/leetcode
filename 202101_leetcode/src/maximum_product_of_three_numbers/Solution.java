package maximum_product_of_three_numbers;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/20
 */
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1] * nums[nums.length - 1]);
    }
}