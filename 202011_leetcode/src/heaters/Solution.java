package heaters;

import java.util.Arrays;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/9
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0;
        int re = 0;
        for (int house:houses){
            while (i<heaters.length-1 && Math.abs(heaters[i]-house)>=heaters[i+1]-house){
                i++;
            }
            re = Math.max(re,Math.abs(heaters[i]-house));
        }
            return re;
    }
}