package NumberoftrailingzerosofN;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/1
 */
//public class Solution {
//    public static int zeros(int n) {
//        int count2 = 0;
//        int count5 = 0;
//        for (int i = 1; i <= n; i++) {
//            count2 += countDivisor(i, 2);
//            count5 += countDivisor(i, 5);
//        }
//        return Math.min(count2, count5);
//    }
//
//    public static int countDivisor(int num, int divisor) {
//        int tmp = 0;
//        for (int i = 0; i < num; i++) {
//            if (num % divisor == 0) {
//                num /= divisor;
//                tmp++;
//            } else {
//                break;
//            }
//        }
//        return tmp;
//    }
//}
public class Solution {
    public static int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += Math.floor(n / i);
        }
        return count;
    }
}