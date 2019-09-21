package com.dd.weeklycontest153.distance_between_bus_stops;

/**
 * @program: weekly_contest
 * @description: none
 * @author: dd
 * @created: 2019/09/08 10:41
 */
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start>destination){
            int tmp = 0;
            tmp = start;
            start = destination;
            destination = tmp;
        }
        int l1 = 0;
        int l2 = 0;
        for (int i = start;i<destination;i++){
            l1+=distance[i];
        }
        for (int i = destination;i<distance.length;i++){
            l2+=distance[i];
        }
        for (int i = 0;i<start;i++){
            l2+=distance[i];
        }
        //System.out.println("l1="+l1+" l2="+l2);
        return java.lang.Math.min(l1,l2);
    }
}