package com.dd.weekly_contest154.maximum_number_of_balloons;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/15 10:37
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxNumberOfBalloons("loonbalxballpoon"));
    }
}
 class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for (int i=0;i<text.length();i++){
            //System.out.println(text.charAt(i)+" "+i);
            if (text.charAt(i)=='b'){
                b++;
            }else if (text.charAt(i)=='a'){
                a++;
            }else if (text.charAt(i)=='l'){
                l++;
            }else if (text.charAt(i)=='o'){
                o++;
            }else if (text.charAt(i)=='n'){
                n++;
            }
        }
        l/=2;
        o/=2;
        //System.out.println("b"+b+"a"+a+"l"+l+"o"+o+"n"+n);
        return java.lang.Math.min(n,(java.lang.Math.min(java.lang.Math.min(b,a),java.lang.Math.min(l,o))));
    }
}