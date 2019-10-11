package reverse_string;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/10 20:37
 */
public class Demo {
}
class Solution{
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        int left = -1;
        int right = s.length;
        while (++left < --right) {
             char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }

        return;
    }

}