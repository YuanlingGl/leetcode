package palindrome_number;

/**
 * @author dd
 * @version 1.0
 * @date 2020/12/23
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num == x || x == num / 10;
    }
}