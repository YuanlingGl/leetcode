package ToCamelCase;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/26
 */

import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if ("-".equals(s.substring(i, i + 1)) || "_".equals(s.substring(i, i + 1))) {
                i++;
                flag = true;
            }
            if (flag) {
                sb.append(s.substring(i, i + 1).toUpperCase());
                flag = false;
            } else {
                sb.append(s.substring(i, i + 1));
            }
        }
        return sb.toString();
    }
}