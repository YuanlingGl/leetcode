package com.dd.weekly_contest155.ugly_number_iii;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/22 11:47
 */
import java.lang.Math.*;
class demo{
    public static void main(String[] args) {
        Solution s= new Solution();
        int n = 1000000000, a = 2, b = 217983653, c = 336916467;
        System.out.println(s.nthUglyNumber(n,a,b,c));
    }
}
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int counta=1,countb=1,countc=1;
        int num=0;
        for (int i=0;i<n;i++){
            num=min3(a*counta,b*countb,c*countc);
            if (num==a*counta)  counta++;
            else if (num==b*countb)  countb++;
            else if (num==c*countc)  countc++;
        }
        return num;
    }
    public int min3(int a,int b,int c){
        return java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(a,b),java.lang.Math.min(a,c)),java.lang.Math.min(b,c));
    }
}
