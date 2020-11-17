package string_to_url_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public String replaceSpaces(String S, int length) {
        char[] c1 = S.toCharArray();
        char[] c2 = new char[length];
        for (int i = 0, j = 0; i < S.length(); i++) {
            if ((c1[i]) == ' ') {
                c2[j]='%';
                j++;
                c2[j]='2';
                j++;
                c2[j]='0';
            }else {
                c2[j]=c1[i];
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: c2
             ) {
            sb.append(c);
        }
        return sb.toString();
    }
}
class Demo{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpaces("Mr John Smith    ",13));
    }
}