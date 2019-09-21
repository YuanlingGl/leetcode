package valid_palindrome_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "abca";
        System.out.println(validPalindrome(b));
    }




    public static boolean validPalindrome(String s) {
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

            if(((sarr[x]>=97&&sarr[x]<=122)&&(sarr[y]>=97&&sarr[y]<=122))&&sarr[x]==sarr[y]){
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


}