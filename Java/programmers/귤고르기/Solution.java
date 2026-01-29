package java.programmers.귤고르기;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Comparator.reverseOrder());

        int sum = 0;
        int kind = 0;
        for (int c : counts) {
            sum += c;
            kind++;
            if (sum >= k) break;
        }

        return kind;
    }
}
