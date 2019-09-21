package valid_palindrome_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /*public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "abaaba";
        String c = "0pppp12110";
        //todo 数字
        //System.out.println(validPalindrome(b));
        System.out.println(isPalindrome(c));
        //System.out.println(isPalindrome2(c));;
    }*/
    public /*static*/ boolean /*isPalindrome*/ validPalindrome(String s) {
        int islol=0;
        s = s.toLowerCase();
        int begin = 0;
        int end = s.length() - 1;
        int num = 0;
        while (begin < end) {
            num = s.charAt(begin);
            if (!((48 <= num && num <= 57) || (97 <= num && num <= 122))) {
                begin++;
                continue;
            }
            num = s.charAt(end);
            if (!((122 >= num && num >= 97) || (57 >= num && num >= 48))) {
                end--;
                continue;
            }
            if (s.charAt(begin) != s.charAt(end)) {
                if(islol ==1){
                    return false;
                }
                islol++;
            }
            begin++;
            end--;

        }
        return true;
    }

    public /*static*/ boolean /*validPalindrome*/ isPalindrome3 (String s){
        //boolean islol = true;
        s = s.toLowerCase();
        int len = s.length();
        int i = 0;
        int j = len-1;
        while(i<j){
            while(!witcher(s.charAt(i))){
                i++;
                //System.out.println(i);
                if(i==len){
                    //return islol;
                    //System.out.println(i+" "+j);
                    //System.out.println(s.charAt(i)+" "+s.charAt(j));
                    return true;
                }
            }
            while (!witcher(s.charAt(j))){
                j--;
            }
            if (s.charAt(i)!=s.charAt(j)){
                //islol=false;
                //break;
                //System.out.println(i+" "+j);
                //System.out.println(s.charAt(i)+" "+s.charAt(j));
                return false;
            }
            System.out.println(s.charAt(i)==s.charAt(j));
            System.out.println(s.charAt(i)+" "+s.charAt(j));
            i++;
            j--;
        }

        return true;
    //return islol;
    }
    public static boolean witcher(char c){
        if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9'){
            return true;
        }
            return false;


    }


    /*public static boolean validPalindrome(String s) {
        if (s.length()==0) return true;
        boolean islol = true;
        char[] sarr = s.toCharArray();
        int x = 0;
        int y = s.length()-1;
        boolean sta = true;
        for(int i = 0;i<(s.length());i++){
            if(y<=x){
                //System.out.println(111);
                if(sta==false){
                    islol=false;
                    break;
                }

                break;
            }
            //System.out.println((int)sarr[x]+" "+(int)sarr[y]);

            if((((sarr[x]>=97&&sarr[x]<=122)&&(sarr[y]>=97&&sarr[y]<=122))||((sarr[y]>=65&&sarr[y]<=90)&&(sarr[x]>=65&&sarr[x]<=90)))&&(sarr[x]==sarr[y]||sarr[x]-32==sarr[y]||sarr[x]+32==sarr[y])){
                //System.out.println(sarr[x]);
                //System.out.println(sarr[y]);
                sta=true;
                x++;
                y--;

            }else{
                sta=false;
                if (sarr[x]<97||sarr[x]>122){
                    x++;
                }
                if (sarr[y]<97||sarr[y]>122){
                    y--;
                }
                y--;
            }
           // System.out.println(1);
            //System.out.println(x+" "+y);
        }
        return islol;
    }
    /*public void delevil(char[] sarr){
        int count = 0;
        for (char tmp:
             sarr) {
            if((tmp>65&&tmp<90)||(tmp>97&&tmp<122)){
                tmp = ' ';
                count++;
            }
        }
    }*/
    /*public static boolean isPalindrome2(String s) {
        int len = s.length();
        s = s.toLowerCase(); //统一转为小写
        int i = 0, j = len - 1;
        while (i < j) {
            //跳过非法字符
            while (!isAlphanumeric(s.charAt(i))) {
                i++;
                //匹配 "   " 这样的空白字符串防止越界
                if (i == len) {
                    return true;
                }
            }
            while (!isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(s.charAt(i)==s.charAt(j));
                System.out.println(s.charAt(i)+" "+s.charAt(j));
                return false;
            }
            //System.out.println(s.charAt(i)==s.charAt(j));
            //System.out.println(s.charAt(i)+" "+s.charAt(j));
            i++;
            j--;
        }
        return true;
    }

    private static boolean isAlphanumeric(char c) {
        if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9') {
            return true;
        }
        return false;
    }

     */



}