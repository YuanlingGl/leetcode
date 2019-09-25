package increasing_triplet_subsequence;

/**
 * @program: 201909_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/25 19:02
 */
public class demo {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {5,1,5,5,2,5,4};
        System.out.println(s.increasingTriplet(nums));
    }
}
//class Solution {
//    public boolean increasingTriplet(int[] nums) {
//        if (nums.length<3)  return false;
//        for (int i=0;i<nums.length-2;i++){
//            System.out.println(nums[i]+" "+nums[i+1]+" "+nums[i+2]);
//            if (nums[i]<nums[i+1]&&nums[i+1]<nums[i+2])  return true;
//        }
//        return false;
//    }
//}
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= one) {
                one = n;
            } else if (n <= two) {
                two = n;
            } else {
                return true;
            }
        }

        return false;
    }
}
