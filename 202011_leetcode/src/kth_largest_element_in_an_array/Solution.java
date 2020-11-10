package kth_largest_element_in_an_array;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/10
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}