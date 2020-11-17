package matrix_cells_in_distance_order;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/17
 */
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                re[i * C + j] = new int[]{i, j};
            }
        }
        Arrays.sort(re, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0));
            }
        });
        return re;
    }
}