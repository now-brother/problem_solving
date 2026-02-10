package java.programmers.level4.단어퍼즐;

import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        int len = t.length();
        int[] dp = new int[len + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= len; i++) {
            for (String s : strs) {
                int slen = s.length();
                if (i >= slen && t.substring(i - slen, i).equals(s) && dp[i - slen] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - slen] + 1);
                }
            }
        }

        return dp[len] == Integer.MAX_VALUE ? -1 : dp[len];
    }
}
