package last_stone_weight;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/30
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for (int i = 0; i < stones.length - 1; i++) {
            Arrays.sort(stones);
            if (stones[index - 1] == 0) break;
            stones[index] -= stones[index - 1];
            stones[index - 1] = 0;
        }
        return stones[index];
    }
}