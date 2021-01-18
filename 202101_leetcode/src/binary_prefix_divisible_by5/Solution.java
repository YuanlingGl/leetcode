package binary_prefix_divisible_by5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dd
 * @version 1.0
 * @date 2021/1/14
 */
class Solution1 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> listA = new ArrayList<>(A.length);
        for (int i = 0; i < A.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(A[j]);
            }
            long num = Integer.parseInt(stringBuilder.toString(),2);
            if (num % 5 != 0) {
                listA.add(false);
            }else {
                listA.add(true);
            }
        }
        return listA;
    }
}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<Boolean>();
        int prefix = 0;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            prefix = ((prefix << 1) + A[i]) % 5;
            list.add(prefix == 0);
        }
        return list;
    }
}

class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        List<Boolean> list = solution.prefixesDivBy5(a);
        for (Boolean bl : list
        ) {
            System.out.print(bl);
        }
//        System.out.println();
    }
}