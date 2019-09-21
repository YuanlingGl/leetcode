package count_primes;

/**
 * @program: 20190914_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/14 20:29
 */
class Solution {
    public int countPrimes(int n) {
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i]=1;
        }
        for (int i = 2;i<n;i++){
            if (nums[i]==1){
                for (int j=2;i*j<n;j++){
                    nums[i*j]=0;
                }
            }
        }
        int count=0;
        for (int i=2;i<n;i++){
            if (nums[i]==1)
                count++;
        }
        return count;
    }
}