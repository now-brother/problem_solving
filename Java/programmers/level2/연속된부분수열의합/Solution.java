package java.programmers.level2.연속된부분수열의합;

public class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;

        int left = 0;
        long sum = 0;

        int bestL = 0;
        int bestR = n - 1;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += sequence[right];

            while (sum > k && left <= right) {
                sum -= sequence[left++];
            }

            if (sum == k) {
                int len = right - left + 1;
                if (len < bestLen || (len == bestLen && left < bestL)) {
                    bestLen = len;
                    bestL = left;
                    bestR = right;
                }
            }
        }

        return new int[]{bestL, bestR};
    }
}
