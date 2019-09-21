package zimifenzu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @program: 20190914_leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/21 21:08
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] te1 = {"eat","eta"};
        System.out.println(s.groupAnagrams(te1));
    }
}



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0||strs==null){
            return new  ArrayList<List<String>>();
        }//字符串数组为空时,直接返回
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();
        for (String str:
             strs) {
            char[] ch = str.toCharArray();//拆解为字符数组方便排序
            Arrays.sort(ch);//排序
            String back2str =String.valueOf(ch);//恢复成字符串
            if (!map.containsKey(back2str)){
                map.put(back2str,new ArrayList<String>());
            }//检验有无此字符串,没有的话加进去
            map.get(back2str).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}