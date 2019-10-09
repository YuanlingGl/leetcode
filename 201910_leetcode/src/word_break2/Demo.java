package word_break2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @program: 201910_leetcode
 * @description:
 * @author: dd
 * @created: 2019/10/09 21:06
 */
public class Demo {
}
class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        LinkedList<String>[] dp = new LinkedList[s.length() + 1];
        LinkedList<String> initial = new LinkedList<>();
        initial.add("");
        dp[0] = initial;
        for (int i = 1; i <= s.length(); i++) {
            LinkedList<String> list = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                if (dp[j].size() > 0 && wordDict.contains(s.substring(j, i))) {
                    for (String l : dp[j]) {
                        list.add(l + (l.equals("") ? "" : " ") + s.substring(j, i));
                    }
                }
            }
            dp[i] = list;
        }
        return dp[s.length()];
    }
}

