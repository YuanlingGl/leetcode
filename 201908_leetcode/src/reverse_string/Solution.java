package reverse_string;

public class Solution {
    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        reverseString(a);
        for (char x:
             a) {System.out.println(x);

        }
    }
    public static void reverseString(char[] s) {

        for(int i=0;i<(s.length/2);i++){
            char tmp ;
            tmp = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=tmp;
        }
    }
}
