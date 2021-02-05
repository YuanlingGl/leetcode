package Permutations;

/**
 * @author dd
 * @version 1.0
 * @date 2021/2/4
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Permutations {
    private static StringBuilder builder = new StringBuilder();
    private static int len = -1;

    public static List<String> singlePermutations(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            return res;
        }
        len = s.length();
        HashSet<String> set = new HashSet<>();
        recurtion(s, new boolean[s.length()], builder, set);
        res = new ArrayList<String>(set);

        return res;
    }

    public static void recurtion(String s, boolean[] used, StringBuilder builder, HashSet<String> res) {
        if (builder.length() == s.length()) {
            res.add(builder.toString());
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                used[i] = true;
                builder.append(s.charAt(i));
                recurtion(s, used, builder, res);
                if (builder.length() != 0) {
                    builder.deleteCharAt(builder.length() - 1);
                }
                used[i] = false;
            }
        }
    }
}