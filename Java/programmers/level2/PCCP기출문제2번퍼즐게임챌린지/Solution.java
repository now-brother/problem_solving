package java.programmers.level2.PCCP기출문제2번퍼즐게임챌린지;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = 1;
        int right = 1_000_000;
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canClear(diffs, times, limit, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private boolean canClear(int[] diffs, int[] times, long limit, int level) {
        long total = 0;

        for (int i = 0; i < times.length; i++) {
            int wrong = Math.max(0, diffs[i] - level);
            int prev = (i == 0 ? 0 : times[i - 1]);

            total += (long) wrong * (prev + times[i]) + times[i];

            if (total > limit) {
                return false;
            }
        }

        return true;
    }
}
