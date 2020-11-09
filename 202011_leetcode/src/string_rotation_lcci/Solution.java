package string_rotation_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        String s = s1+s1;
        return s.contains(s2);
    }
}