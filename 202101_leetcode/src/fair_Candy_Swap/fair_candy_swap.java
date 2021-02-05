package fair_Candy_Swap;

import java.util.*;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/1
 */
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        Set<Integer> rec = new HashSet<>();
        int delta = (sumA - sumB) / 2;
        for (int num : A) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}