package java.programmers.level3.사라지는발판;

class Solution {

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    private int N, M;

    public int solution(int[][] board, int[] aloc, int[] bloc) {
        N = board.length;
        M = board[0].length;
        return dfs(board, aloc[0], aloc[1], bloc[0], bloc[1]).turns;
    }

    private Result dfs(int[][] board, int ax, int ay, int bx, int by) {
        if (board[ax][ay] == 0) return new Result(false, 0); 
        
        boolean win = false;
        int minTurns = Integer.MAX_VALUE;
        int maxTurns = 0;

        for (int dir = 0; dir < 4; dir++) {
            int nax = ax + dx[dir];
            int nay = ay + dy[dir];

            if (nax < 0 || nay < 0 || nax >= N || nay >= M) continue;
            if (board[nax][nay] == 0) continue;

            board[ax][ay] = 0; 
            Result res = dfs(board, bx, by, nax, nay); 
            board[ax][ay] = 1; 

            if (!res.win) {
                win = true;
                minTurns = Math.min(minTurns, res.turns + 1);
            } else {
                maxTurns = Math.max(maxTurns, res.turns + 1);
            }
        }

        return win ? new Result(true, minTurns) : new Result(false, maxTurns);
    }

    private static class Result {
        boolean win;
        int turns;

        public Result(boolean win, int turns) {
            this.win = win;
            this.turns = turns;
        }
    }
}
