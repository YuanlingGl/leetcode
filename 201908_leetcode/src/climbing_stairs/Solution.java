package climbing_stairs;

/**
 * @program: 20190822——leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/11 21:40
 */
public class Solution {
    public int climbStairs(int n){
        if (n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
