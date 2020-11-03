package valid_mountain_array;

class Solution1 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        for (int i = 0, j = A.length - 1; i < A.length - 1 && j > 0; ) {
            Boolean iFlag = false, jFlag = false;
            if (A[i] < A[i + 1]) {
                i++;
            } else if (A[i] == A[i + 1]) {
                return false;
            } else {
                iFlag = true;
            }
            if (A[j] < A[j - 1]) {
                j--;
            } else if (A[j] == A[j - 1]) {
                return false;
            } else {
                jFlag = true;
            }
            if (iFlag && jFlag) {
                if (i == j) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}