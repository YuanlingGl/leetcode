package rotate_matrix_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/19
 */
class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            {
                for (int j = 0; j < (matrix.length >> 1); j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = tmp;
                }
            }
        }
    }
}