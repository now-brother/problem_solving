package java.programmers.level2.석유시추;

import java.util.*;

class Solution {

    private static int[][] lands;
    private static boolean[][] check;
    private static int cnt;
    private static int n;
    private static int m;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};
    private static Set<Integer> columnSet;

    public static void dfs(int x, int y) {
        check[y][x] = true;
        cnt++;
        if (x >= 0 && x < m) {
            columnSet.add(x);
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (lands[ny][nx] == 1 && !check[ny][nx]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public int solution(int[][] land) {
        int answer = 0;
        n = land.length;
        m = land[0].length;
        lands = land;
        check = new boolean[n][m];

        int[] colOil = new int[m];

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (lands[y][x] == 1 && !check[y][x]) {
                    cnt = 0;
                    columnSet = new HashSet<>();
                    dfs(x, y);

                    for (int col : columnSet) {
                        if (col >= 0 && col < m) {
                            colOil[col] += cnt;
                        }
                    }
                }
            }
        }

        for (int oil : colOil) {
            answer = Math.max(answer, oil);
        }

        return answer;
    }
}
