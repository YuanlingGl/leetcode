package com.dd.fall_2019.guess_numbers;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/24 21:38
 */
class Solution {
    public int game(int[] guess, int[] answer) {
        int count=0;
        if (guess[0]==answer[0])    count++;
        if (guess[1]==answer[1])    count++;
        if (guess[2]==answer[2])    count++;
        return count;
    }
}
