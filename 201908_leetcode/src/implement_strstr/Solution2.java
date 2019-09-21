package implement_strstr;

public class Solution2 {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return 0;
        }
        if (haystack.length()==0){
            return -1;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        if (haystack.equals(needle)){
            return 0;
        }

        int i = 0,j = 0,u = 0,k = 0;
        while (i<haystack.length()){
            if(u==needle.length()){
                return i-2;
            }

            if (haystack.charAt(i)==needle.charAt(u)&&u<needle.length()){
                i++;
                u++;
            }else if(haystack.charAt(i)!=needle.charAt(u)){
                i++;
                u=0;
            }

        }
        return -1;
    }
}
