package DisemvowelTrolls;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/27
 */
public class Troll {
    public static String disemvowel(String str) {
        String[] rep = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String s : rep
        ) {
            str = str.replace(s, "");
        }
        return str;
    }
}