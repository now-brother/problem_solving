package java.programmers.고득점알고리즘.sort.hindex;

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int count = n - i;
            answer = Math.max(answer, Math.min(citations[i], count));
        }
        return answer;
    }
}
