package diving_boar_lcci;

class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] re = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            re[i]=shorter*(k-i)+longer*(i);
        }
        return re;
    }
}