package maximum_average_subarray_i;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/11
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        double maxSumDouble = maxSum;
//        System.out.println(maxSum);
//        System.out.println(maxSum/k);
        return maxSumDouble / k;
    }
}
class Demo{
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution1 solution1 = new Solution1();
        int[] a = {1,12,-5,-6,50,3};
        System.out.println(solution.findMaxAverage(a,4));
        System.out.println(solution1.findMaxAverage(a,4));
    }
}
class Solution1 {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);

        }
        System.out.println(res);
        System.out.println(res/k);
        return res/k;
    }
}
