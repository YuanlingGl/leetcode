package com.dd.weeklycontest153.distance_between_bus_stops;

/**
 * @program: weekly_contest
 * @description: none
 * @author: dd
 * @created: 2019/09/08 10:52
 */
/*
*   [7,10,1,12,11,14,5,0]
*   7
*   2
* */
public class Demo {
    public static void main(String[] args) {
        int[] distance ={7,10,1,12,11,14,5,0};
        int start = 7;
        int destination = 2;
        Solution s = new Solution();
        System.out.println(s.distanceBetweenBusStops(distance,start,destination));

    }
}
