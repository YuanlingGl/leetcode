package number_of_equivalent_domino_pairs;

import java.util.Arrays;
import java.util.Map;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/26
 */
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int num = 0;
//        int[] arr = new int[100];
        int[][] arr = new int[10][10];
        for (int[] a : dominoes
        ) {
//            Arrays.sort(a);
            num += a[0] > a[1] ? arr[a[0]][a[1]]++ : arr[a[1]][a[0]]++;
        }
        return num;
    }
}