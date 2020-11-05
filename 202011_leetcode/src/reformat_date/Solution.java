package reformat_date;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/5
 */
class Solution {
    public String reformatDate(String date) {
        String[] day = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"};
        String[] month = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] s = date.split(" ");
        int d = 0, m = 0;
        int M_IN_Y = 12;
        for (int i = 0; i < M_IN_Y; i++) {
            if (month[i].equals(s[1])) {
                m = i + 1;
                break;
            }
        }
        int D_IN_M = 31;
        for (int i = 0; i < D_IN_M; i++) {
            if (day[i].equals(s[0])) {
                d = i + 1;
                break;
            }
        }
        String dre = d < 10 ? 0 + "" + d : d + "";
        String mre = m < 10 ? 0 + "" + m : m + "";
        return s[2] + "-" + mre + "-" + dre;
    }
}