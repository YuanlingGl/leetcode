package check_permutation_lcci;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
//        if (s1.length()!=s2.length()){
//            return false;
//        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
//        for (int i = 0; i < s1.length(); i++) {
//            if (c1[i] != c2[i]) {
//                return false;
//            }
//        }
//        return true;
    }
}
class Demo{
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.CheckPermutation("abc","bca");
        System.out.println(solution.CheckPermutation("abc","bca"));
    }
}