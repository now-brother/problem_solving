package Java.programmers.배달;

class Solution {

    private static int[][] map;
    private static boolean[] visited;
    private static int N;

    public int solution(int N, int[][] road, int K) {
        this.N = N;
        map = new int[N][N];
        visited = new boolean[N];
        int[] dist = new int[N];

        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        for (int[] r : road) {
            int a = r[0] - 1;
            int b = r[1] - 1;
            int t = r[2];

            if (map[a][b] == 0 || map[a][b] > t) {
                map[a][b] = t;
                map[b][a] = t;
            }
        }

        dist[0] = 0;
        dfs(0, 0, dist);

        int answer = 0;
        for (int d : dist) {
            if (d <= K) answer++;
        }

        return answer;
    }

    private static void dfs(int node, int cost, int[] dist) {
        for (int i = 0; i < N; i++) {
            if (map[node][i] != 0) {
                int nextCost = cost + map[node][i];
                if (nextCost < dist[i]) {
                    dist[i] = nextCost;
                    dfs(i, nextCost, dist);
                }
            }
        }
    }
}
