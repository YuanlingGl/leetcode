package search_a_2d_matrix_ii;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/03 21:25
 */
public class Demo {
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start our "pointer" in the bottom-left
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else { // found it
                return true;
            }
        }

        return false;
    }
}
