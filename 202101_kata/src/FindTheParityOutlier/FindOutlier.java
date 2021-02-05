package FindTheParityOutlier;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/28
 */
public class FindOutlier {
    static int find(int[] integers) {
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 != 0) {
                flag++;
            } else {
                flag--;
            }
        }
        for (int a : integers
        ) {
            if (flag > 0 && a % 2 == 0) {
                return a;
            } else if (flag < 0 && a % 2 != 0) {
                return a;
            } else {

            }
        }
        return 0;
    }
}