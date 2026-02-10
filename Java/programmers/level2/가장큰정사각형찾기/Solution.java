package java.programmers.level2.가장큰정사각형찾기;

class Solution {
    public int solution(int[][] board) {
        int h = board.length;
        int w = board[0].length;
        int max = 0;

        int[][] dp = new int[h][w];

        for (int i = 0; i < h; i++) {
            dp[i][0] = board[i][0];
            max = Math.max(max, dp[i][0]);
        }
        for (int j = 0; j < w; j++) {
            dp[0][j] = board[0][j];
            max = Math.max(max, dp[0][j]);
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (board[i][j] == 1) {
                    dp[i][j] = Math.min(
                        Math.min(dp[i - 1][j], dp[i][j - 1]),
                        dp[i - 1][j - 1]
                    ) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max * max;
    }
}
