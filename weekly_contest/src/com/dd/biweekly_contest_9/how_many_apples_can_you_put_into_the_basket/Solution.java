package com.dd.biweekly_contest_9.how_many_apples_can_you_put_into_the_basket;

import java.util.Arrays;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/21 22:46
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {988,641,984,635,461,527,491,610,274,104,348,468,220,837,126,111,536,368,89,201,589,481,849,708,258,853,563,868,92,76,566,398,272,697,584,851,302,766,88,428,276,797,460,244,950,134,838,161,15,330};
        System.out.println(s.maxNumberOfApples(a));
    }
}

class Solution {
    public int maxNumberOfApples(int[] arr) {
        int k5=5000;
        int sum=0;
        Arrays.sort(arr);
        //System.out.println(arr[]);
        for (int i:
             arr) {
            sum+=i;
        }
        //System.out.println(sum);
        int count=0;
        for (int i=arr.length;i>0;i--){
            if (sum<k5) return i;
            sum-=arr[i-1];
            //System.out.println(arr.length-i);
        }
        return 0;
    }
}