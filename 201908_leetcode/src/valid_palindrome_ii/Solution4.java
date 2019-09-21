package valid_palindrome_ii;

public class Solution4 {
    public boolean validPalindrome(String s){
        int left = 0;
        int right = s.length();
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return isPalindrome(s, left, right - 1) || isPalindrome(s, left - 1, right);//还是没看懂这里为啥能这么写
            }
                left++;
                right--;

        }
        return true;
    }
    private boolean isPalindrome(String s,int i,int j){//是否回文，其实是判断这个位置上是否相等
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
