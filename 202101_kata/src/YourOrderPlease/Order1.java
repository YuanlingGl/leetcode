package YourOrderPlease;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/29
 */
import java.util.Arrays;
import java.util.Comparator;

public class Order1 {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}