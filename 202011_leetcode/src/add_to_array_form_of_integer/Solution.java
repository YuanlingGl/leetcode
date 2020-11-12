package add_to_array_form_of_integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dd
 * @version 1.0
 * @date 2020/11/12
 */
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}