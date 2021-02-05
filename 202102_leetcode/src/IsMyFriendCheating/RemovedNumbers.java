package IsMyFriendCheating;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

///**
// * @author dd
// * @version 1.0
// * @date 2021/2/3
// */
//public class RemovedNumbers {
//
//    public static List<long[]> removNb(long n) {
//        // your code
//        List<long[]> re = new ArrayList<>();
//        long sum = Stream.iterate(0, x -> x + 1).limit(n).reduce(0, Integer::sum);
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (sum-i-j==i*j){
//                    long[] relo = new long[2];
//                    relo[0]=i;
//                    relo[1]=j;
//                    re.add(relo);
//                }
//            }
//        }
//        return re;
//    }
//}

public class RemovedNumbers {

    static List<long[]> removNb(long n) {
        long sum = (1 + n) * n / 2;
        LinkedList<long[]> result = new LinkedList<>();

        long minimum = (n * (n - 1) / 2) / (n + 1);
        long maximum = (long) (Math.sqrt(sum + 1) - 1);

        for (long i = maximum; i >= minimum; --i) {
            long j = (sum - i) / (i + 1);
            if (i * j == sum - i - j) {
                result.addFirst(new long[]{i, j});
                result.addLast(new long[]{j, i});
            }
        }

        return result;
    }
}