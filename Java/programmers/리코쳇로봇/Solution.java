package java.programmers.리코쳇로봇;

import java.util.*;

class Solution {
    public int solution(String[] board) {
        int n = board.length, m = board[0].length();
        int sx = -1, sy = -1;
        for (int i = 0; i < n; i++) {
            int j = board[i].indexOf('R');
            if (j != -1) { sx = i; sy = j; break; }
        }
        boolean[][] v = new boolean[n][m];
        int[] dx = {1,-1,0,0}, dy = {0,0,1,-1};
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{sx, sy, 0});
        v[sx][sy] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], d = cur[2];
            if (board[x].charAt(y) == 'G') return d;
            for (int k = 0; k < 4; k++) {
                int nx = x, ny = y;
                while (true) {
                    int tx = nx + dx[k], ty = ny + dy[k];
                    if (tx < 0 || tx >= n || ty < 0 || ty >= m) break;
                    if (board[tx].charAt(ty) == 'D') break;
                    nx = tx; ny = ty;
                }
                if (!v[nx][ny]) {
                    v[nx][ny] = true;
                    q.add(new int[]{nx, ny, d + 1});
                }
            }
        }
        return -1;
    }
}
