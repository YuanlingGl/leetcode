package excel_sheet_column_number;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/6
 */
class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int re = 0;
        for (int i = 0; i < s.length(); i++) {
            re = re * 26 + (c[i] - 'A' + 1);

        }
        return re;
    }
}