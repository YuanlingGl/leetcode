package com.dd.weeklycontest153.day_of_the_week;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: weekly_contest
 * @description: none
 * @author: dd
 * @created: 2019/09/08 11:05
 */
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        int num = year*365+month*30+day-1;
        num%=7;
        //System.out.println(num);
        String str = "";
        switch((int) num){
            case 1:str = "Monday";break;
            case 2:str = "Tuesday";break;
            case 3:str = "Wednesday";break;
            case 4:str = "Thursday";break;
            case 5:str = "Friday";break;
            case 6:str = "Saturday";break;
            case 0:str = "Sunday";break;
        }
        return str;
    }
}






/*
class Solution {
    public String dayOfTheWeek(int day, int month, int year){

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = year+"-"+month+"-"+day;
        //System.out.print(input + " Parses as ");

        Date t = null;

        try {
            t = ft.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long num = t.getTime();
        num%=604800000;
        num/=86400000;
        num+=5;
        num%=7;
        //System.out.println(num);
        String str = "";
        switch((int) num){
            case 1:str = "Monday";break;
            case 2:str = "Tuesday";break;
            case 3:str = "Wednesday";break;
            case 4:str = "Thursday";break;
            case 5:str = "Friday";break;
            case 6:str = "Saturday";break;
            case 0:str = "Sunday";break;

        }
        return str;
    }
}
/*
"", "", "", "", "", "", ""
 */

