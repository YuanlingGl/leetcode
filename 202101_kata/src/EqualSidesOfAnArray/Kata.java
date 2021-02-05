package EqualSidesOfAnArray;



/**
 * @author dd
 * @version 1.0
 * @date 2021/1/28
 */
import java.util.Arrays;
public class Kata {
    public static int findEvenIndex(int[] arr) {
        int total = Arrays.stream(arr).sum();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (2 * sum + arr[i] == total) {
                return i;
            } else {
                sum += arr[i];
            }
        }
        return -1;
    }
}