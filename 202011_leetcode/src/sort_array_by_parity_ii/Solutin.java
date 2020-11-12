package sort_array_by_parity_ii;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/12
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] re = new int[A.length];
        int ou = 0, ji = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                re[ou]=A[i];
                ou+=2;
            }else {
                re[ji]=A[i];
                ji+=2;
            }
        }
        return re;
    }
}