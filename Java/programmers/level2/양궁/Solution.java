package java.programmers.level2.양궁;

class Solution {
    
    private int maxDiff = Integer.MIN_VALUE;
    private int[] answer = new int[11];

    public int[] solution(int n, int[] info) {
        dfs(0, n, new int[11], info);
        return maxDiff <= 0 ? new int[]{-1} : answer;
    }

    private void dfs(int idx, int remain, int[] ryan, int[] apeach) {
        if (idx == 11) {
            if (remain > 0) ryan[10] += remain;

            int ryanScore = 0;
            int apeachScore = 0;

            for (int i = 0; i < 11; i++) {
                if (ryan[i] > apeach[i]) {
                    ryanScore += (10 - i);
                } else if (apeach[i] != 0) {
                    apeachScore += (10 - i);
                }
            }

            int diff = ryanScore - apeachScore;
            if (diff > maxDiff) {
                maxDiff = diff;
                answer = ryan.clone();
            } else if (diff == maxDiff) {
                for (int i = 10; i >= 0; i--) {
                    if (ryan[i] > answer[i]) {
                        answer = ryan.clone();
                        break;
                    } else if (ryan[i] < answer[i]) break;
                }
            }

            if (remain > 0) ryan[10] -= remain;
            return;
        }

        if (apeach[idx] < remain) {
            ryan[idx] = apeach[idx] + 1;
            dfs(idx + 1, remain - ryan[idx], ryan, apeach);
            ryan[idx] = 0;
        }

        // 이 점수를 포기하는 경우
        dfs(idx + 1, remain, ryan, apeach);
    }
}
