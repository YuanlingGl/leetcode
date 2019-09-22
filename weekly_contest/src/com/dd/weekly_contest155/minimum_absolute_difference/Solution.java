package com.dd.weekly_contest155.minimum_absolute_difference;

import java.util.*;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/22 10:37
 */
class demo{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-11,-10,-139,-141,77,-71,-56,150,188,-95,118,121,-180,-167,189,-214,78,-184,-123,113,156,205,155,50,191};
        List<List<Integer>> bk = s.minimumAbsDifference(arr);
        List<Integer> de = new ArrayList<>();
//        de.add(1);
//        de.add(2);
//        for (int i:
//             de) {
//            System.out.println(de);
//        }
//        Collections.reverse(de);
//        de.add(3);
//        de.add(4);
//        for (int i:
//             de) {
//            System.out.println(de);
//        }
        for (List<Integer> i:
             bk) {
            for (int j:
                 i) {
                System.out.print(j+" ");
            }
        }
    }
}

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        int minDiff = Integer.MAX_VALUE;
        for (int i=1;i<arr.length;i++){
//            if (arr[i-1]<0){
//                if (arr[i]-arr[i-1]<=minDiff){
//                    if (arr[i]-arr[i-1]<minDiff){
//                        map2.clear();
//                        minDiff=arr[i]-arr[i-1];
//                    }
//                    map2.put(arr[i-1],arr[i]);
//                    //System.out.println(arr[i-1]+" "+arr[i]+" ");
//                    //System.out.println(arr[i-1]-arr[i]);
//                }
//            }else{
                if (arr[i]-arr[i-1]<=minDiff){
                    if (arr[i]-arr[i-1]<minDiff){
                        map.clear();
                        map2.clear();
                        minDiff=arr[i]-arr[i-1];
                    }
                    map.put(arr[i-1],arr[i]);
                    //System.out.println(arr[i-1]+" "+arr[i]+" ");
                }
//            }

        }
        List<List<Integer>> re = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
//            List<Integer> tmp = new ArrayList<>();
//            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//            tmp.add(entry.getKey());
//            tmp.add(entry.getValue());
//            re.add(tmp);
//        }
//        for (List<Integer> i:
//             re) {
//            System.out.println(i);
//        }
//        Collections.reverse(re);
//        List<List<Integer>> tmp2 = re;
//        re=tmp2;
//        for (List<Integer> i:
//                re) {
//            System.out.println(i);
//        }
        Map<Integer, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        //System.out.println(result2);

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            List<Integer> tmp = new ArrayList<>();
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            tmp.add(entry.getKey());
            tmp.add(entry.getValue());
            re.add(tmp);
        }

//        for (List<Integer> i:
//                re) {
//            System.out.println(i);
//        }
        return re;
    }
}
