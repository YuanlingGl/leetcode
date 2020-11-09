package zero_matrix_lcci;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        Set setX = new HashSet();
        Set setY = new HashSet();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    setX.add(i);
                    setY.add(j);
                }
            }
        }
        List<Integer> listX = new ArrayList(setX);
        List<Integer> listY = new ArrayList(setY);
        for (int i : listX) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int j : listY) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}