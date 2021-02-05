package YourOrderPlease;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/29
 */
public class Order {
    public static String order(String words) {
        if ("".equals(words)) {
            return "";
        }
        String[] str1 = words.split(" ");
        String[] str2 = new String[str1.length];
        for (String s : str1
        ) {
            char[] chars = s.toCharArray();
            for (char c : chars
            ) {
                if (c > '0' && c <= '9') {
                    str2[(int) c - (int) ('0') - 1] = s;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str2
        ) {
            sb.append(" ").append(s);
        }
        return sb.toString().trim();
    }
}