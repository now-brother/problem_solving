package Java.programmers.PCCP기출문제2번퍼즐게임챌린지;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int level = 1;

        while (true) {
            long total = 0;
            boolean possible = true;

            for (int i = 0; i < times.length; i++) {
                int wrong = Math.max(0, diffs[i] - level);
                int prev = (i == 0 ? 0 : times[i - 1]);

                total += (long) wrong * (prev + times[i]) + times[i];

                if (total > limit) {
                    possible = false;
                    break;
                }
            }

            if (possible) return level;
            level++;
        }
    }
}