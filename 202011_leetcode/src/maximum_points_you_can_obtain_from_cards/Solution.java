package maximum_points_you_can_obtain_from_cards;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/11
 */

/**
 * 用例
 * [1,79,80,1,1,1,200,1] 3
 */
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int maxSum = sum;
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
            sum -= cardPoints[i];
            sum += cardPoints[j];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 79, 80, 1, 1, 1, 200, 1};
        int[] b = {1, 2, 3, 4, 5, 6, 1};

        System.out.println(solution.maxScore(a, 3));
    }
}