package string_to_url_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public String replaceSpaces(String S, int length) {
        char[] c1 = S.toCharArray();

        int K = 0;
        for (int i = 0; i < length; i++) {
            if (c1[i] == ' ') {
                K++;
            }
        }
        char[] c2 = new char[K * 2 + length];
        for (int i = 0, j = 0; i < length; i++) {
            if ((c1[i]) == ' ') {
                c2[j++] = '%';
                c2[j++] = '2';
                c2[j++] = '0';
            } else {
                c2[j++] = c1[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : c2
        ) {
            sb.append(c);
        }
        return sb.toString();
    }
}

class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpaces("Mr John Smith    ", 13));
    }
}