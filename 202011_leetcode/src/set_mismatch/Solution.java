package set_mismatch;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/11
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
}

class Demo {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 4, 6, 5};
        Solution s = new Solution();
        System.out.println(s.findErrorNums(a)[0]);
        System.out.println(s.findErrorNums(a)[1]);
    }
}
