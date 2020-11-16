package check_if_it_is_a_straight_line;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/13
 */
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i = 1; i < coordinates.length; i++){
            if((coordinates[1][1] - coordinates[0][1]) * (coordinates[i][0] - coordinates[i - 1][0]) !=  (coordinates[i][1] - coordinates[i - 1][1]) *  (coordinates[1][0] - coordinates[0][0]) ) {
                return false;
            }
        }
        return true;
    }
}