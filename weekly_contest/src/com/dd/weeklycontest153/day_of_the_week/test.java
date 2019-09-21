package com.dd.weeklycontest153.day_of_the_week;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: weekly_contest
 * @description:
 * @author: dd
 * @created: 2019/09/08 11:07
 */
public class test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        String input = args.length == 0 ? "2019-9-17" : args[0];

        //System.out.print(input + " Parses as ");

        Date t;

            t = ft.parse(input);
            long num = t.getTime();
            num%=604800000;
            num/=86400000;
            num+=5;
            num%=7;
            //System.out.println(num);
            //System.out.println("Unparseable using " + ft);

    }
    /*public static int dayforweek(String pTime) throws Throwable{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date tmpDate = format.parse(pTime);
        Calendar cal = new GregorianCalendar();
        cal.set(tmpDate.getYear(),tmpDate.getMonth(),tmpDate.getDay());
        return cal.get(Calendar.DAY_OF_WEEK);
    }

     */
    }
