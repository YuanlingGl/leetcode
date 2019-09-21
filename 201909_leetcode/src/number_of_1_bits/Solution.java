package number_of_1_bits;

/**
 * @program: 20190914_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/16 22:11
 */
public class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
