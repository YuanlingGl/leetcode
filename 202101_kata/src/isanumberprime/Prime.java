package isanumberprime;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/28
 */
public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}