package Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 20190914_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/14 19:18
 */
class a{
    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 0;i<100;i++){
            System.out.println(s.fizzBuzz(i));
        }

    }
}
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        if (n==0){
            return list;
        }
        if (n==1){
            list.add(1+"");
            return list;
        }
        for (int i=1;i<=n;i++){
            if (i%3==0&&i%5==0){
                //System.out.println(35);
                list.add("FizzBuzz");
            }else if (i%3==0){
                //System.out.println(3);
                list.add("Fizz");
            }else if(i%5==0){
                //System.out.println(5);
                list.add("Buzz");
            }else {
                //System.out.println(0);
                list.add(i+"");
            }
        }
        return list;
    }
}
