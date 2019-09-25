package com.dd.fall_2019.deep_dark_fraction;

/**
 * @program: weekly_contest
 * @description: wdnmd真就玩这个?
 * @author: dd
 * @created: 2019/09/24 21:44
 */
public class Demo {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] c={3,2,0,2};
        int[] re = s.fraction(c);
        for (int i:
             re) {
            System.out.println(i);
        }
    }
}
class Solution {
    public int[] fraction(int[] cont) {
        int[] re= new int[2];
        long num1 = 1;
        long num2 = 0;
        for (int i=cont.length-1;i>=0;i--){
            if (i==cont.length-1){
                num2=cont[i];
                num1=1;
            }else {
                if (cont[i]==0){
                    long tmp=0;
                    tmp=num1;
                    num1=num2;
                    num2=tmp;
                }else {
                    long tmp=0;
                    tmp=num1;
                    num1=num2;
                    num2=tmp;
                    num2+=cont[i]*num1;
                }
            }

        }
        int gcd = gcd(num1,num2);
        //System.out.println(num1+" "+num2);
        re[1]= (int) (num1/gcd);
        re[0]= (int) (num2/gcd);
        return re;
    }
    public int gcd (long num1,long num2){
        int count=0;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i==0&&num2%i==0){
                count = i;
            }
        }
        return count;
    }
}