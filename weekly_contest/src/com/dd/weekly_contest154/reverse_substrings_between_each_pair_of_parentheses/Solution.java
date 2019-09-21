package com.dd.weekly_contest154.reverse_substrings_between_each_pair_of_parentheses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/15 11:01
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseParentheses("(u(love)i)"));
    }
}
class Solution {
    public String reverseParentheses(String s) {
        StringBuffer s1 = new StringBuffer();
        s1.append(s);
        return helper(s1).toString();
    }
    public StringBuffer helper(StringBuffer s){
        StringBuffer magic = new StringBuffer();
        magic.append(s);
        List harry = new ArrayList();
        //int right = 0;
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            if (s.charAt(i)=='('){
                harry.add(i);
            }

            if (s.charAt(i)==')'){
                System.out.println(harry);
                int start = (int) harry.get((harry.size()-1));
                harry.remove(harry.size()-1);
                int end = i;
                StringBuffer potter = new StringBuffer();
                potter.append(s.substring(start,end));
                potter.reverse();
                //System.out.println(start+" "+end);
                s.replace(start,end,potter.toString());
                s.delete(end-1,end+1);
            }

        }
        return s;
    }
}
