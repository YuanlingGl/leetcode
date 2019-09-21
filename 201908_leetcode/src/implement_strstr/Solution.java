package implement_strstr;

public class Solution {
    public int strStr(String haystack, String needle){
        int res = -1;
        int lenn = needle.length();
        int lenh = haystack.length();
        if(lenh<lenn){
            return -1;
        }
        int start = 0;
        int end = lenn-1;
        while (end<lenh){
            if(haystack.substring(start,end+1).equals(needle)){
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }
}
