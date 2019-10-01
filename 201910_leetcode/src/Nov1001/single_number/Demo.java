package Nov1001.single_number;

/**
 * @program: 201910_leetcode
 * @description: 位操作
 * @author: dd
 * @created: 2019/10/01 21:04
 */
public class Demo {
}
class Solution {
    public int singleNumber(int[] nums) {
        int tmp = nums[0];
        if (nums.length>1){
            for(int i=1;i<nums.length;i++){
                tmp^=nums[i];
            }
        }

        return tmp;
    }
}