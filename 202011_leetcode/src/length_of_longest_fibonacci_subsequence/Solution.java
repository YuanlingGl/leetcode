package length_of_longest_fibonacci_subsequence;

import java.util.Arrays;

class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int max = 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int tmpi = A[i];
                int tmpj = A[j];
                int sum = tmpi + tmpj;
                int cur = 2;
                while (Arrays.binarySearch(A, sum) >= 0) {
                    tmpi = tmpj;
                    tmpj = sum;
                    sum = tmpi + tmpj;
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max < 3 ? 0 : max;
    }
}