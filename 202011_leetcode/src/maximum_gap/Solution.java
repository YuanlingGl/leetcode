package maximum_gap;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/26
 */
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0,j=1;j<nums.length;j++,i++){
            if (nums[j]-nums[i]>max){
                max = nums[j]-nums[i];
            }
        }
        return max;
    }
}