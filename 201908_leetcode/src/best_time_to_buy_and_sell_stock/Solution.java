package best_time_to_buy_and_sell_stock;

/**
 * @program: 20190822——leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/11 21:46
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minv=Integer.MAX_VALUE;
        for (int i:
             prices) {
            if (i<minv){
                minv=i;
            }else if (i-minv>maxp){
                maxp=i-minv;
            }

        }
        return maxp;
    }
}
