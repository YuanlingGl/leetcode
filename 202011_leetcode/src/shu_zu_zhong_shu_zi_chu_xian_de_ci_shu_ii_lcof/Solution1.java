package shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */

class Solution1 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}// &与 |或 ^非 ~取反