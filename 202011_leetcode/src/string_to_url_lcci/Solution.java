package string_to_url_lcci;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/16
 */
class Solution {
    public String replaceSpaces(String S, int length) {
        char[] c1 = S.toCharArray();

        int K = 0;
        for (int i = 0; i < length; i++) {
            if (c1[i] == ' ') {
                K++;
            }
        }
        char[] c2 = new char[K * 2 + length];
        for (int i = 0, j = 0; i < length; i++) {
            if ((c1[i]) == ' ') {
                c2[j++] = '%';
                c2[j++] = '2';
                c2[j++] = '0';
            } else {
                c2[j++] = c1[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : c2
        ) {
            sb.append(c);
        }
        return sb.toString();
    }

    public String replaceSpaces1(String S, int length) {
        return S.substring(0, length).replace(" ", "%20");
    }

    public String replaceSpaces2(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = S.charAt(i);
            if (ch == ' ') {
                sb.append("%20");
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public String replaceSpaces3(String S, int length) {
        char[] ch = new char[length * 3];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                ch[index++] = '%';
                ch[index++] = '2';
                ch[index++] = '0';
            } else {
                ch[index] = c;
                index++;
            }
        }
        return new String(ch, 0, index);
    }
}

class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpaces("Mr John Smith    ", 13));
    }
}
