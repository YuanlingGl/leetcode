package move_zeroes;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/14 21:40
 */
public class Demo {
}
class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                nums[i - cnt] = nums[i];
            }
        }
        for (int i = nums.length - cnt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}