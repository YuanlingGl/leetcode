package compress_string_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/5 10:12
 */
class Solution {
    public String compressString(String S) {
        int sLength = S.length();
        char[] ca = S.toCharArray();
        StringBuilder resb = new StringBuilder();
        int i = 0;
        while (i < sLength) {
            int j = i;
            while (j < sLength && S.charAt(j) == S.charAt(i)) {
                j++;
            }
            resb.append(S.charAt(i));
            resb.append(j - i);
            i = j;
        }
        String re = resb.toString();
        if (re.length()<sLength){
            return re;
        }else {
            return S;
        }
    }
}