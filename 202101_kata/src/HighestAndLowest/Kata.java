package HighestAndLowest;

import java.util.Arrays;
/**
 * @author dd
 * @version 1.0
 * @date 2021/1/25
 */
public class Kata {
    public static String highAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}