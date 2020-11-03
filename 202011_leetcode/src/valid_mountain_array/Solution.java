package valid_mountain_array;

class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        return up(A);
    }

    public Boolean up(int[] A) {
        for (int i = 0, j = 1;i<A.length-1;i++,j++) {
            if (A[i] > A[j] || A[i] == A[j]) {
                if (i == 0) {
                    return false;
                }
                if (i == A.length - 1) {
                    return false;
                }
                return down(A, i);
            }
        }
        return false;
    }

    public boolean down(int[] A, int a) {
        for (int i = a, j = a + 1; i < A.length - 1; i++, j++) {
            if (A[i] <= A[j]) {
                return false;
            }
        }
        return true;
    }
}