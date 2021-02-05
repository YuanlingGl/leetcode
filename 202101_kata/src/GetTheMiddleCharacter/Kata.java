package GetTheMiddleCharacter;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/28
 */
class Kata {
    public static String getMiddle(String word) {
        int mid = word.length() / 2;
        if (word.length() % 2 != 0) {
            return word.substring(mid, mid + 1);
        } else {
            return word.substring(mid - 1, mid + 1);
        }
    }
}